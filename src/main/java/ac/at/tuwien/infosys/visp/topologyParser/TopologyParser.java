package ac.at.tuwien.infosys.visp.topologyParser;

import ac.at.tuwien.infosys.visp.common.operators.Operator;
import ac.at.tuwien.infosys.visp.common.operators.ProcessingOperator;
import ac.at.tuwien.infosys.visp.common.operators.Sink;
import ac.at.tuwien.infosys.visp.common.operators.Source;
import ac.at.tuwien.infosys.visp.topologyParser.antlr.VispLexer;
import ac.at.tuwien.infosys.visp.topologyParser.antlr.VispParser;
import ac.at.tuwien.infosys.visp.topologyParser.antlr.listener.TopologyListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.log4j.Logger;


import java.io.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TopologyParser {

    private final boolean DEBUG = false;

    private Map<String, Operator> topology = new LinkedHashMap<>();

    public static final String GRAPHVIZ_OUT = "/tmp/output.dot";

    private static final Logger logger = Logger.getLogger(TopologyParser.class);

    public Map<String, Operator> getTopology() {
        return topology;
    }

    public void setTopology(Map<String, Operator> topology) {
        this.topology = topology;
    }

    public void loadTopologyFromClasspath(String file) {
        logger.debug("Starting loadTopologyFromClasspath for file " + file);

        try {
            parse(file, true);
        } catch (IOException e) {
            logger.error(e.getMessage());
            throw new RuntimeException("Unable to parse topology file", e);
        }
    }

    public void loadTopologyFromFileSystem(String file) {
        try {
            parse(file, false);
        } catch (IOException e) {
            logger.error(e.getMessage());
            throw new RuntimeException("Unable to parse topology file", e);
        }
    }


    private void parse(String inputFile, boolean loadFromClassPath) throws IOException {
        logger.info("Starting antlr parse process for input file: " + inputFile);

        InputStream is;
        if (loadFromClassPath) {
            is = this.getClass().getResourceAsStream("/" + inputFile);
        } else {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(is);
        VispLexer lexer = new VispLexer(antlrInputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        VispParser parser = new VispParser(tokens);
        ParseTree tree = parser.configfile();

        ParseTreeWalker walker = new ParseTreeWalker();
        TopologyListener topologyListener = new TopologyListener(parser);

        // in this method, the generated parse tree is walked
        // here, the actual topology is created
        walker.walk(topologyListener, tree);


        if (DEBUG) {
            logger.debug("Writing debug graphviz-file to " + GRAPHVIZ_OUT);
            topologyListener.writeGraphvizFile(GRAPHVIZ_OUT);
        }


        logger.debug("The following topology was created after parsing:");
        for (Operator o : topologyListener.getTopology().values()) {
            logger.debug(o.toString());
        }

        topology = topologyListener.getTopology();

    }

    public String generateTopologyFile() {
        try {
            File temp = File.createTempFile("topology", ".txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
            for (Map.Entry<String, Operator> entry : topology.entrySet()) {
                String operatorName = entry.getKey();
                Operator operator = entry.getValue();
                bw.write("$" + operatorName + " = " + getOperatorSubclass(operator) + "(" + getOperatorSourcesFormatted(operator) + ") {\n");
                if (operator instanceof ProcessingOperator) {
                    bw.write("  allowedLocations = " + allowedLocationsToList(operator.getAllowedLocationsList()) + ",\n");
                }
                bw.write("  concreteLocation = " + operator.getConcreteLocation() + ",\n");
                if (!(operator instanceof Source)) {
                    bw.write("  inputFormat = \"" + String.join(" ", operator.getInputFormat()) + "\",\n");
                }
                if (!(operator instanceof Sink)) {
                    bw.write("  outputFormat = \"" + operator.getOutputFormat() + "\",\n");
                }
                bw.write("  type = \"" + operator.getType() + "\"");
                if (operator instanceof ProcessingOperator) {
                    bw.write("  stateful = " + (operator.isStateful() ? "true" : "false") + ",\n");
                    bw.write(",\n  size = " + operator.getSize().toString().toLowerCase() + ",\n");
                    bw.write("  expectedDuration = " + ((ProcessingOperator) operator).getExpectedDuration() + ",\n");
                    bw.write("  scalingCPUThreshold = " + ((ProcessingOperator) operator).getScalingCPUThreshold() + ",\n");
                    bw.write("  scalingMemoryThreshold = " + ((ProcessingOperator) operator).getScalingMemoryThreshold() + ",\n");
                    bw.write("  queueThreshold = " + ((ProcessingOperator) operator).getQueueThreshold());
                }
                bw.write("\n}\n\n");
            }


            bw.close();
            return temp.getAbsolutePath();
        } catch (IOException e) {
            throw new RuntimeException("Could not write topology to temporary file", e);
        }
    }

    private String allowedLocationsToList(List<Operator.Location> allowedLocationsList) {
        String returnString = "";
        for (Operator.Location loc : allowedLocationsList) {
            returnString += loc.getIpAddress() + "/" + loc.getResourcePool() + " ";
        }

        returnString = returnString.trim();

        return returnString;
    }

    private String getOperatorSourcesFormatted(Operator operator) {
        if (operator.getSources().size() == 0) {
            return "";
        }
        String returnString = "";
        for (Operator source : operator.getSources()) {
            returnString += "$" + source.getName() + ", ";
        }
        return returnString.substring(0, returnString.length() - 2);
    }

    private String getOperatorSubclass(Operator operator) {
        if (operator instanceof Source) {
            return "Source";
        } else if (operator instanceof Sink) {
            return "Sink";
        } else if (operator instanceof ProcessingOperator) {
            return "Operator";
        } else
            throw new RuntimeException("Unknown operator type for operator " + operator);
    }

    private List<String> getSources(String start) {
        throw new RuntimeException("Not yet implemented");
    }

}
