package at.tuwien.infosys.parser.operatorUpdates;

import entities.operators.Operator;

import java.util.List;

public class SourcesUpdate extends ChangeToBeExecuted {
    /**
     * updates oldSources to newSources
     */
    List<Operator> oldSources;
    List<Operator> newSources;
    public SourcesUpdate(List<Operator> oldSources, List<Operator> newSources) {
        this.oldSources = oldSources;
        this.newSources = newSources;
    }
    public List<Operator> getOldSources() {
        return oldSources;
    }
    public List<Operator> getNewSources() {
        return newSources;
    }
    public void setNewSources(List<Operator> newSources) {
        this.newSources = newSources;
    }
    public void setOldSources(List<Operator> oldSources) {
        this.oldSources = oldSources;
    }
}
