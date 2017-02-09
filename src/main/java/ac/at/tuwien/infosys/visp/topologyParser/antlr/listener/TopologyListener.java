package ac.at.tuwien.infosys.visp.topologyParser.antlr.listener;

import ac.at.tuwien.infosys.visp.common.operators.Operator;
import ac.at.tuwien.infosys.visp.common.operators.ProcessingOperator;
import ac.at.tuwien.infosys.visp.common.operators.Sink;
import ac.at.tuwien.infosys.visp.common.operators.Source;
import ac.at.tuwien.infosys.visp.topologyParser.antlr.VispBaseListener;
import ac.at.tuwien.infosys.visp.topologyParser.antlr.VispParser;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import java.io.*;
import java.util.*;

public class TopologyListener extends VispBaseListener {
    VispParser parser;
    List<String> linesToWriteToGraphViz;
    private static final Logger logger = Logger.getLogger(TopologyListener.class);


    String currentNodeName = "";

    Operator newOperator;

    private Map<String, Operator> topology = new LinkedHashMap<>();

    // the following fields MUST be set, otherwise the input is not accepted:

    boolean typeIsSet,
            allowedLocationsIsSet, statefulIsSet, concreteLocationIsSet;


    public TopologyListener(VispParser parser) {
        this.parser = parser;
        linesToWriteToGraphViz = new ArrayList<String>();
        linesToWriteToGraphViz.add("\ndigraph {\n");
    }

    public Map<String, Operator> getTopology() {
        return topology;
    }

    public void writeGraphvizFile(String filename) throws IOException {
        linesToWriteToGraphViz.add("\n}");

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(filename), "utf-8"))) {
            for (String s : linesToWriteToGraphViz) {
                writer.write("\t" + s);
            }
        }

    }

    @Override
    public void enterConfigfile(VispParser.ConfigfileContext ctx) {
        // this method is called when the parser begins reading the config file
    }

    @Override
    public void enterNodeBlock(VispParser.NodeBlockContext ctx) {
        // this method is called in the beginning of each node block
        typeIsSet = false;
        allowedLocationsIsSet = false;
        statefulIsSet = false;
        concreteLocationIsSet = false;
        //System.out.println("Entering nodeblock: " + ctx.getText());
    }

    @Override
    public void exitNodeBlock(VispParser.NodeBlockContext ctx) {
        // this method is called when the parsing of a certain node is completed
        // now it is time to create the corresponding object and
        // add it to the topology

        if (newOperator instanceof ProcessingOperator) {
            if (!typeIsSet) {
                throw new RuntimeException("Type not set for operator " +
                        currentNodeName);
            }

            if (newOperator.getSourcesText().size() == 0) {
                throw new RuntimeException("No sources set for operator " +
                        currentNodeName);
            }

            if (!allowedLocationsIsSet) {
                throw new RuntimeException("Allowed locations not set for operator " +
                        currentNodeName);
            }

            if (!statefulIsSet) {
                throw new RuntimeException("Stateful not set for operator " +
                        currentNodeName);
            }
        } else {
            if (typeIsSet) {
                // all required fields are there
                if (newOperator instanceof Sink) {
                    if (newOperator.getSourcesText().size() == 0) {
                        throw new RuntimeException("No sources set for sink " + currentNodeName);
                    }
                }
            } else {
                throw new RuntimeException("Type missing for node " + currentNodeName);
            }

        }


        if (!concreteLocationIsSet) {
            // concrete location was not explicitly set

            if(newOperator instanceof Source || newOperator instanceof Sink) {
                throw new RuntimeException("No concreteLocation set for source/sink " + currentNodeName);
            }

            // pick one randomly from allowed ones

            newOperator.setConcreteLocation(newOperator.getAllowedLocationsList().get(
                    new Random().nextInt(newOperator.getAllowedLocationsList().size())));
            logger.info("concrete location was not specified - " +
                    "picked concrete location to be " + newOperator.getConcreteLocation().getIpAddress() + "/" +
                    newOperator.getConcreteLocation().getResourcePool());
        }

        newOperator.setName(currentNodeName);
        topology.put(currentNodeName, newOperator);

    }

    @Override
    public void enterNewNodeId(VispParser.NewNodeIdContext ctx) {
        logger.debug("define a new node with the id " + ctx.getText());
        currentNodeName = ctx.getText().substring(1); // remove the dollar sign
    }


    @Override
    public void enterSourceNode(VispParser.SourceNodeContext ctx) {
        logger.debug("add node " + ctx.getText() + " as a source for node " + currentNodeName);
        newOperator.getSourcesText().add(ctx.getText().substring(1)); // remove dollar sign
        linesToWriteToGraphViz.add("\"" + ctx.getText().substring(1) + "\" -> \"" + currentNodeName + "\"\n");
    }

    @Override
    public void enterAllowedLocationsStmt(VispParser.AllowedLocationsStmtContext ctx) {
        if (newOperator instanceof Source || newOperator instanceof Sink) {
            logger.warn("allowedLocations statement has no effect for operator type Source/Sink");
            return;
        }
        allowedLocationsIsSet = true;
        for (TerminalNode location : ctx.LOCATION()) {
            Operator.Location operatorLocation = new Operator.Location(getIpAddress(location.getText()), getResourcePool(location.getText()));
            newOperator.getAllowedLocationsList().add(operatorLocation);
        }

        // TODO: remove the old String form
        newOperator.setAllowedLocations(StringUtils.join(newOperator.getAllowedLocationsList(), ","));

    }

    private String getResourcePool(String text) {
        String[] splitted = text.split("/");
        return splitted[1];
    }

    private String getIpAddress(String text) {
        String[] splitted = text.split("/");
        return splitted[0];
    }

    @Override
    public void enterInputFormatStmt(VispParser.InputFormatStmtContext ctx) {
        List<String> inputFormats = new ArrayList<>();
        for (TerminalNode n : ctx.STRING()) {
            inputFormats.add(stringRemoveQuotes(n.getText()));
        }
        newOperator.setInputFormat(inputFormats);
    }

    @Override
    public void enterStatefulStmt(VispParser.StatefulStmtContext ctx) {
        if (newOperator instanceof Source || newOperator instanceof Sink) {
            logger.warn("stateful statement has no effect for operator type Source/Sink");
            return;
        }
        statefulIsSet = true;
        newOperator.setStateful(ctx.BOOLEAN().getText().toLowerCase().equals("true"));
    }


    @Override
    public void enterTypeStmt(VispParser.TypeStmtContext ctx) {
        typeIsSet = true;
        newOperator.setType(stringRemoveQuotes(ctx.STRING().getText()));
    }

    @Override
    public void enterOutputFormatStmt(VispParser.OutputFormatStmtContext ctx) {
        if (newOperator instanceof Sink) {
            logger.warn("output format statement has no effect for operator type Sink");
            return;
        }
        newOperator.setOutputFormat(stringRemoveQuotes(ctx.STRING().getText()));
    }

    private String stringRemoveQuotes(String input) {
        if (input.charAt(0) == '"' && input.charAt(input.length() - 1) == '"') {
            return input.substring(1, input.length() - 1);
        } else {
            return input;
        }
    }

    @Override
    public void enterNodeType(VispParser.NodeTypeContext ctx) {

        logger.debug("Node " + currentNodeName + " has nodeType " + ctx.getText());
        String color = "";
        switch (ctx.getText()) {
            case "Source":
                color = "beige";
                newOperator = new Source();
                break;
            case "Operator":
                color = "skyblue";
                newOperator = new ProcessingOperator();
                break;
            case "Sink":
                color = "springgreen";
                newOperator = new Sink();
                break;
            default:
                throw new RuntimeException("Invalid node type: " + ctx.getText());
        }

        initOperator();

        String toWrite = "\"" + currentNodeName + "\" [style=filled, shape=box, fillcolor=" + color +
                ", label=<" + currentNodeName.substring(1) + "<BR />\n" +
                "\t<FONT POINT-SIZE=\"10\">" + ctx.getText() + "</FONT>>"
                + "]";
        this.linesToWriteToGraphViz.add("\t" + toWrite + "\n");
    }

    @Override
    public void enterConcreteLocationStmt(VispParser.ConcreteLocationStmtContext ctx) {
        concreteLocationIsSet = true;
        newOperator.setConcreteLocation(new Operator.Location(getIpAddress(ctx.LOCATION().getText()), getResourcePool(ctx.LOCATION().getText())));

        // TODO: add check whether concrete concreteLocation is in allowed locations
    }

    @Override
    public void enterSizeStmt(VispParser.SizeStmtContext ctx) {
        if (newOperator instanceof Source || newOperator instanceof Sink) {
            logger.warn("size statement has no effect for operator type Source/Sink");
            return;
        }

        String sizeString = ctx.sizeType().getText();
        if (sizeString.equals("small")) {
            newOperator.setSize(Operator.Size.SMALL);
        } else if (sizeString.equals("medium")) {
            newOperator.setSize(Operator.Size.MEDIUM);
        } else if (sizeString.equals("large")) {
            newOperator.setSize(Operator.Size.LARGE);
        } else {
            throw new RuntimeException("Unknown operator size: " + sizeString);
        }
    }

    @Override
    public void enterExpectedDurationStmt(VispParser.ExpectedDurationStmtContext ctx) {
        if (newOperator instanceof Source || newOperator instanceof Sink) {
            logger.warn("expectedDuration statement has no effect for operator type Source/Sink");
            return;
        }
        try {
            ((ProcessingOperator) newOperator).setExpectedDuration(Double.parseDouble(ctx.NUMBER().getText()));
        } catch (Exception e) {
            logger.error("Could not set optional attribute expected duration");
        }
    }

    @Override
    public void enterScalingCPUThresholdStmt(VispParser.ScalingCPUThresholdStmtContext ctx) {
        if (newOperator instanceof Source || newOperator instanceof Sink) {
            logger.warn("scalingCPUThreshold statement has no effect for operator type Source/Sink");
            return;
        }
        try {
            ((ProcessingOperator) newOperator).setScalingCPUThreshold(Double.parseDouble(ctx.NUMBER().getText()));
        } catch (Exception e) {
            logger.error("Could not set optional attribute scalingCPUThreshold");
        }
    }

    @Override
    public void enterScalingMemoryThresholdStmt(VispParser.ScalingMemoryThresholdStmtContext ctx) {
        if (newOperator instanceof Source || newOperator instanceof Sink) {
            logger.warn("scalingMemoryThreshold statement has no effect for operator type Source/Sink");
            return;
        }
        try {
            ((ProcessingOperator) newOperator).setScalingMemoryThreshold(Double.parseDouble(ctx.NUMBER().getText()));
        } catch (Exception e) {
            logger.error("Could not set optional attribute scalingMemoryThreshold");
        }
    }

    @Override
    public void enterQueueThreshold(VispParser.QueueThresholdContext ctx) {
        if (newOperator instanceof Source || newOperator instanceof Sink) {
            logger.warn("queueThreshold statement has no effect for operator type Source/Sink");
            return;
        }
        try {
            ((ProcessingOperator) newOperator).setQueueThreshold(Double.parseDouble(ctx.NUMBER().getText()));
        } catch (Exception e) {
            logger.error("Could not set optional attribute queueThreshold");
        }
    }

    @Override
    public void enterPinnedStmt(VispParser.PinnedStmtContext ctx) {
        if (newOperator instanceof Source || newOperator instanceof Sink) {
            logger.warn("pinned statement has no effect for operator type Source/Sink");
            return;
        }
        try {
            ((ProcessingOperator) newOperator).setPinned(ctx.BOOLEAN().getText().toLowerCase().equals("true"));
        } catch (Exception e) {
            logger.error("Could not set optional attribute pinned");
        }
    }

    @Override
    public void enterReplicationAllowedStmt(VispParser.ReplicationAllowedStmtContext ctx) {
        if (newOperator instanceof Source || newOperator instanceof Sink) {
            logger.warn("replicationAllowed statement has no effect for operator type Source/Sink");
            return;
        }
        try {
            ((ProcessingOperator) newOperator).setReplicationAllowed(ctx.BOOLEAN().getText().toLowerCase().equals("true"));
        } catch (Exception e) {
            logger.error("Could not set optional attribute replicationAllowed");
        }
    }

    @Override
    public void exitConfigfile(VispParser.ConfigfileContext ctx) {
        for (String name : topology.keySet()) {
            for (String source : topology.get(name).getSourcesText()) {
                try {
                    topology.get(name).getSources().add(topology.get(source));
                } catch (Exception e) {
                    logger.warn("Could not set source '" + source + "' for node '" + currentNodeName + "'");
                }
            }
        }

        checkIsEachNonSinkIsUsedAsSource();
    }

    private void checkIsEachNonSinkIsUsedAsSource() {
        for (Operator o : topology.values()) {
            if (o instanceof Sink) {
                continue;
            }
            boolean foundAsSource = false;
            for (Operator potentialSourceDonor : topology.values()) {
                if (potentialSourceDonor.getSources().contains(o)) {
                    foundAsSource = true;
                }
            }
            if (!foundAsSource) {
                logger.warn("Non-sink node " + o.getName() + " is used nowhere as a source");
            }
        }
    }

    private void initOperator() {
        newOperator.setSourcesText(new ArrayList<String>());
        newOperator.setAllowedLocationsList(new ArrayList<Operator.Location>());
        if (newOperator instanceof ProcessingOperator) {
            newOperator.setSize(Operator.Size.UNKNOWN); // default
            ((ProcessingOperator) newOperator).setPinned(false);
            ((ProcessingOperator) newOperator).setReplicationAllowed(true);
            ((ProcessingOperator) newOperator).setQueueThreshold(0.0);
            ((ProcessingOperator) newOperator).setScalingCPUThreshold(0.0);
            ((ProcessingOperator) newOperator).setScalingMemoryThreshold(0.0);
            ((ProcessingOperator) newOperator).setExpectedDuration(0.0);
        }

    }


}
