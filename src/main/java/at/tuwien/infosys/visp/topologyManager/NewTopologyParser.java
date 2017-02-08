package at.tuwien.infosys.visp.topologyManager;

import ac.at.tuwien.infosys.visp.common.operators.Operator;
import ac.at.tuwien.infosys.visp.common.operators.ProcessingOperator;
import ac.at.tuwien.infosys.visp.common.operators.Sink;
import ac.at.tuwien.infosys.visp.common.operators.Source;
import at.tuwien.infosys.visp.topologyManager.antlr.VispLexer;
import at.tuwien.infosys.visp.topologyManager.antlr.VispParser;
import at.tuwien.infosys.visp.topologyManager.antlr.listener.TopologyListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class NewTopologyParser {

    //@Value("${visp.infrastructurehost}")
    //private String infrastructureHost;

    private Map<String, Operator> topology = new LinkedHashMap<>();

    public static final String GRAPHVIZ_OUT = "/tmp/output.dot";

    private static final Logger LOG = LoggerFactory.getLogger(NewTopologyParser.class);

    public Map<String, Operator> getTopology() {
        return topology;
    }


    public void loadTopologyFromClasspath(String file) {
        System.out.println("Starting loadTopologyFromClasspath for file " + file);

        try {
            parse(file, true);
        } catch (IOException e) {
            LOG.error(e.getMessage());
            throw new RuntimeException("Unable to parse topology file");
        }

//        enrichTopology();

    }

    public void loadTopologyFromFileSystem(String file) {
        System.out.println("Starting loadTopologyFromClasspath for file " + file);

        try {
            parse(file, false);
        } catch (IOException e) {
            LOG.error(e.getMessage());
            throw new RuntimeException("Unable to parse topology file");
        }

//        enrichTopology();

    }

//    private void enrichTopology() {
//        /**
//         * (My guess): transforms the sources string into an actual list of
//         * operators that is then set for each operator.
//         */
//
//        for (Operator operator : topology.values()) {
//            List<Operator> realOperators = new ArrayList<>();
//
//            for (String op : operator.getSourcesText()) {
//                realOperators.add(topology.get(op));
//            }
//
//            operator.setSources(realOperators);
//            operator.setMessageBrokerHost(infrastructureHost); // TODO get rid of this during deployment. Momentan läuft nur 1 rabbitmq instance; ersetze durch IP im topology file
//            topology.put(operator.getName(), operator);
//        }
//
//    }


    private void parse(String inputFile, boolean loadFromClassPath) throws IOException {

        LOG.info("Starting antlr parse process for input file: " + inputFile);

//        Resource resource = new ClassPathResource("topologyConfiguration/sequence_v2.conf");
        InputStream is;
        if(loadFromClassPath) {
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


        topologyListener.writeGraphvizFile(GRAPHVIZ_OUT);

//        System.out.println("Wrote graphviz file to: " + GRAPHVIZ_OUT);
//
//        System.out.println("This topology has been generated:");
//
//        for(Operator o : topologyListener.getTopology().values()) {
//            System.out.println(o);
//        }

        topology = topologyListener.getTopology();

    }

    public String generateTopologyFile() {
        try{
            File temp = File.createTempFile("topology", ".txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
            for (Map.Entry<String, Operator> entry : topology.entrySet()) {
                String operatorName = entry.getKey();
                Operator operator = entry.getValue();
                bw.write("$" + operatorName + " = " + getOperatorSubclass(operator) + "(" + getOperatorSourcesFormatted(operator) + ") {\n");
                bw.write("  allowedLocations = " + allowedLocationsToList(operator.getAllowedLocationsList()) + ",\n");
                bw.write("  concreteLocation = " + operator.getConcreteLocation() + ",\n");
                bw.write("  inputFormat = " + String.join(" ", operator.getInputFormat()) + ",\n");
                bw.write("  type = " + operator.getType() + ",\n");
                bw.write("  outputFormat = " + operator.getOutputFormat() + ",\n");
                bw.write("  stateful = " + (operator.isStateful() ? "true" : "false") + ",\n");
                bw.write("}\n\n");
            }



            bw.close();
            return temp.getAbsolutePath();
        }catch(IOException e){
            throw new RuntimeException("Could not write topology to temporary file", e);
        }
    }

    private String allowedLocationsToList(List<Operator.Location> allowedLocationsList) {
        String returnString = "";
        for(Operator.Location loc : allowedLocationsList) {
            returnString += loc.getIpAddress() + "/" + loc.getResourcePool() + " ";
        }

        returnString = returnString.trim();

        return returnString;
    }

    private String getOperatorSourcesFormatted(Operator operator) {
        if(operator.getSources().size() == 0) {
            return "";
        }
        String returnString = "";
        for(Operator source : operator.getSources()) {
            returnString += "$" + source.getName() + ", ";
        }
        return returnString.substring(0, returnString.length() - 2);
    }

    private String getOperatorSubclass(Operator operator) {
        if(operator instanceof Source) {
            return "Source";
        } else if(operator instanceof Sink) {
            return "Sink";
        } else if(operator instanceof ProcessingOperator) {
            return "Operator";
        } else
            throw new RuntimeException("Unknown operator type for operator " + operator);
    }

    private List<String> getSources(String start) {
        throw new RuntimeException("Not yet implemented");
    }

//    private List<String> getSources(String start) {
//        List<String> sources = new ArrayList<>();
//
//        String sourcesText = start.substring(start.indexOf("(") + 1, start.indexOf(")"));
//        if (sourcesText.contains(",")) {
//
//            for (String source : sourcesText.split(",")) {
//                source = source.trim();
//                sources.add(source.substring(1));
//            }
//        } else {
//            sources.add(sourcesText.substring(1));
//        }
//        return sources;
//    }

}
