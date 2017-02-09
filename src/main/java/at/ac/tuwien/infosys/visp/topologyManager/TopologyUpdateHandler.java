package at.ac.tuwien.infosys.visp.topologyManager;


import ac.at.tuwien.infosys.visp.common.operators.Operator;
import at.ac.tuwien.infosys.visp.topologyManager.operatorUpdates.SourcesUpdate;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class TopologyUpdateHandler {
    /**
     * this class is used to handle the process of updating the topology at runtime
     */

    private String incomingTopologyFilePath;
    NewTopologyParser newTopologyParser;

    public TopologyUpdateHandler() {
        incomingTopologyFilePath = null;
        newTopologyParser = new NewTopologyParser();
    }

    public void saveIncomingTopologyFile(String fileContent) {
        System.out.println("Inside TopologyUpdateHandler::saveIncomingTopologyFile");
        try {
            File temp = File.createTempFile("updatedTopology", ".txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
            bw.write(fileContent);
            bw.close();
            incomingTopologyFilePath = temp.getAbsolutePath();
            System.out.println("Saved new topology file to: " + incomingTopologyFilePath);
        } catch (IOException e) {
            throw new RuntimeException("Could not write topology to temporary file", e);
        }
    }

    public void processIncomingTopologyFile() {
        /**
         * this uses the antlr parser to actually process the new topology file and generate
         * a topology hashmap
         */

        newTopologyParser.loadTopologyFromFileSystem(incomingTopologyFilePath);
        Map<String, Operator> incomingTopology = newTopologyParser.getTopology();
        System.out.println("Incoming topology contains the following entries:");
        for (Map.Entry<String, Operator> entry : incomingTopology.entrySet()) {
            String name = entry.getKey();
            Operator operator = entry.getValue();
            System.out.println(operator);
        }

    }

    public List<TopologyUpdate> updateTopology(Map<String, Operator> oldTopology, Map<String, Operator> newTopology) {
        /**
         * this function computes which changes need to be performed when updating from the old to the new topology on host location
         */
        List<TopologyUpdate> returnList = new ArrayList<TopologyUpdate>();

        // general assumption: operator names are unique throughout _both_ files
        // (if two operators have the same name in both files, it must be the same one)

        for (Map.Entry<String, Operator> entry : oldTopology.entrySet()) {
            String oldOperatorName = entry.getKey();
            Operator oldOperator = entry.getValue();
            if (!newTopology.containsKey(oldOperatorName)) {
                // operator no longer existing, remove it
                returnList.add(new TopologyUpdate(oldOperator.getConcreteLocation(), TopologyUpdate.Action.REMOVE_OPERATOR, oldOperatorName));
            } else {
                // operator is still here, check if we need to update
                updateOperator(returnList, oldOperator, newTopology.get(oldOperatorName));
            }
        }
        for (Map.Entry<String, Operator> entry : newTopology.entrySet()) {
            String newOperatorName = entry.getKey();
            Operator newOperator = entry.getValue();
            if (!oldTopology.containsKey(newOperatorName)) {
                // operator is new, create it
                returnList.add(new TopologyUpdate(newOperator.getConcreteLocation(), TopologyUpdate.Action.ADD_OPERATOR, newOperatorName));
            } else {
                // this should already have been handled above...
            }
        }
        return returnList;
    }

    private void updateOperator(List<TopologyUpdate> updateList, Operator oldOperator, Operator newOperator) {
        /**
         * checks whether there are differences between the two operators and adds the according updates if there are
         */
        if (!oldOperator.getConcreteLocation().equals(newOperator.getConcreteLocation())) {
            // operator is migrated
            updateList.add(new TopologyUpdate(oldOperator.getConcreteLocation(), TopologyUpdate.Action.REMOVE_OPERATOR, oldOperator.getName()));
            updateList.add(new TopologyUpdate(newOperator.getConcreteLocation(), TopologyUpdate.Action.ADD_OPERATOR, newOperator.getName()));
        }

        if(oldOperator.getSources().size() != newOperator.getSources().size()) {
            boolean updateSources = false;
            // check if sources are the same
            updateSources = equalSources(oldOperator, newOperator);
            if(updateSources) {
                assert(newOperator.getConcreteLocation().equals(oldOperator.getConcreteLocation()));
                TopologyUpdate topologyUpdate = new TopologyUpdate(oldOperator.getConcreteLocation(),
                        TopologyUpdate.Action.UPDATE_OPERATOR, TopologyUpdate.UpdateType.UPDATE_SOURCE,
                        newOperator.getName());
                topologyUpdate.setChangeToBeExecuted(new SourcesUpdate(oldOperator.getSources(), newOperator.getSources()));
                updateList.add(topologyUpdate);

            }
        }
    }

    private boolean equalSources(Operator oldOperator, Operator newOperator) {
        boolean unequalSources = false;
        for(Operator o : oldOperator.getSources()) {
            boolean found = false;
            for(Operator n : newOperator.getSources()) {
                if(n.getName().equals(o.getName())) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                unequalSources = true;
            }
        }
        for(Operator o : newOperator.getSources()) {
            boolean found = false;
            for(Operator n : oldOperator.getSources()) {
                if(n.getName().equals(o.getName())) {
                    found = true;
                    break;
                }
            }
            if(!found) {
                unequalSources = true;
            }
        }
        return unequalSources;
    }

}