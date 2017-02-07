package at.tuwien.infosys.parser.antlr.listener;

import entities.operators.Operator;
import entities.operators.ProcessingOperator;
import entities.operators.Sink;
import entities.operators.Source;
import at.tuwien.infosys.parser.antlr.VispBaseListener;
import at.tuwien.infosys.parser.antlr.VispParser;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.*;

/**
 * Created by bernhard on 10.11.16.
 */
public class TopologyListener extends VispBaseListener {
    VispParser parser;
    List<String> linesToWriteToGraphViz;
    private static final Logger LOG = LoggerFactory.getLogger(TopologyListener.class);


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
        //System.out.println(ctx.getText());
    }

    @Override
    public void enterNodeBlock(VispParser.NodeBlockContext ctx) {
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
        System.out.println("Creating object...");

        if (typeIsSet && allowedLocationsIsSet && statefulIsSet) {
            // all required fields are there
        } else {
            throw new RuntimeException("One or more required attributes missing for node " + currentNodeName);
        }

        if(!concreteLocationIsSet) {
            // concrete location was not explicitly set
            // pick one randomly from allowed ones

            newOperator.setConcreteLocation(newOperator.getAllowedLocationsList().get(
                    new Random().nextInt(newOperator.getAllowedLocationsList().size())));
            System.out.println("concrete location was not specified - " +
                    "picked concrete location to be " + newOperator.getConcreteLocation());
        }

        newOperator.setName(currentNodeName);
        topology.put(currentNodeName, newOperator);

    }

    @Override
    public void enterNewNodeId(VispParser.NewNodeIdContext ctx) {
        System.out.println("define a new node with the id " + ctx.getText());
        currentNodeName = ctx.getText().substring(1); // remove the dollar sign
    }


    @Override
    public void enterSourceNode(VispParser.SourceNodeContext ctx) {
        System.out.println("add node " + ctx.getText() + " as a source");
        newOperator.getSourcesText().add(ctx.getText().substring(1));
        linesToWriteToGraphViz.add("\"" + ctx.getText().substring(1) + "\" -> \"" + currentNodeName + "\"\n");
    }

    @Override
    public void enterAllowedLocationsStmt(VispParser.AllowedLocationsStmtContext ctx) {
        allowedLocationsIsSet = true;
        //List<VispParser.IpAddressContext> allIps = ctx.ipAddress();
        System.out.println("Allowed locations: ");
        for (TerminalNode ipAddress : ctx.IP_ADDRESS()) {
            System.out.println(ipAddress.getText());
            newOperator.getAllowedLocationsList().add(ipAddress.getText());
        }
        newOperator.setAllowedLocations(StringUtils.join(newOperator.getAllowedLocationsList(), ","));

    }

    @Override
    public void enterInputFormatStmt(VispParser.InputFormatStmtContext ctx) {
        System.out.println("inputFormat = " + ctx.STRING().getText());
        newOperator.getInputFormat().add(stringRemoveQuotes(ctx.STRING().getText()));
    }

    @Override
    public void enterSourceStmt(VispParser.SourceStmtContext ctx) {
        System.out.println("source = " + ctx.STRING().getText());

    }

    @Override
    public void enterStatefulStmt(VispParser.StatefulStmtContext ctx) {
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

        newOperator.setOutputFormat(stringRemoveQuotes(ctx.STRING().getText()));
    }

    private String stringRemoveQuotes(String input) {
        if(input.charAt(0) == '"' && input.charAt(input.length()-1) == '"') {
            return input.substring(1, input.length()-1);
        } else {
            return input;
        }
    }

    @Override
    public void enterNodeType(VispParser.NodeTypeContext ctx) {

        System.out.println("Node " + currentNodeName + " has nodeType " + ctx.getText());
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
        //List<VispParser.IpAddressContext> allIps = ctx.ipAddress();
        System.out.println("Concrete concreteLocation: ");
        System.out.println(ctx.IP_ADDRESS().getText());
        newOperator.setConcreteLocation(ctx.IP_ADDRESS().getText());
        // TODO: add check whether concrete concreteLocation is in allowed locations
    }

    @Override
    public void exitConfigfile(VispParser.ConfigfileContext ctx) {

        for (String name : topology.keySet()) {
            for (String source : topology.get(name).getSourcesText()) {
                topology.get(name).getSources().add(topology.get(source));
                // TODO: what if node does not exist?
            }
            // randomly pick a concreteLocation from the list of allowed locations:
            //topology.get(name).setConcreteLocation(topology.get(name).getAllowedLocationsList().get(
            //        new Random().nextInt(topology.get(name).getAllowedLocationsList().size())));
        }
    }

    private void initOperator() {
        newOperator.setSourcesText(new ArrayList<String>());
        newOperator.setAllowedLocationsList(new ArrayList<String>());
        newOperator.setInputFormat(new ArrayList<String>());
    }


}
