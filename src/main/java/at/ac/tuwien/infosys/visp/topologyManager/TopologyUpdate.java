package at.ac.tuwien.infosys.visp.topologyManager;

import ac.at.tuwien.infosys.visp.common.operators.Operator;
import at.ac.tuwien.infosys.visp.topologyManager.operatorUpdates.ChangeToBeExecuted;

public class TopologyUpdate {
    private Operator.Location affectedHost; // which host is affected by this update


    public enum Action {REMOVE_OPERATOR, ADD_OPERATOR, UPDATE_OPERATOR};

    private Action action; // what kind of update is performed

    public enum UpdateType {UPDATE_SOURCE};

    private UpdateType updateType;

    private ChangeToBeExecuted changeToBeExecuted;


    public ChangeToBeExecuted getChangeToBeExecuted() {
        return changeToBeExecuted;
    }

    public void setChangeToBeExecuted(ChangeToBeExecuted changeToBeExecuted) {
        this.changeToBeExecuted = changeToBeExecuted;
    }

    private String affectedOperatorId;

    public TopologyUpdate(Operator.Location affectedHost, Action action, String affectedOperatorId) {
        this.affectedHost = affectedHost;
        this.action = action;
        this.affectedOperatorId = affectedOperatorId;
        this.updateType = null;
    }

    public TopologyUpdate(Operator.Location affectedHost, Action action, UpdateType updateType, String affectedOperatorId) {
        if(!action.equals(Action.UPDATE_OPERATOR)) {
            throw new RuntimeException("Invalid constructor used for action " + action.toString());
        }
        this.affectedHost = affectedHost;
        this.action = action;
        this.updateType = updateType;
        this.affectedOperatorId = affectedOperatorId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TopologyUpdate that = (TopologyUpdate) o;

        if (!affectedHost.equals(that.affectedHost)) return false;
        if (action != that.action) return false;
        return affectedOperatorId.equals(that.affectedOperatorId);

    }

    @Override
    public int hashCode() {
        int result = affectedHost.hashCode();
        result = 31 * result + action.hashCode();
        result = 31 * result + affectedOperatorId.hashCode();
        return result;
    }
    public UpdateType getUpdateType() {
        return updateType;
    }

    public void setUpdateType(UpdateType updateType) {
        this.updateType = updateType;
    }
    public Operator.Location getAffectedHost() {
        return affectedHost;
    }

    public void setAffectedHost(Operator.Location affectedHost) {
        this.affectedHost = affectedHost;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public String getAffectedOperatorId() {
        return affectedOperatorId;
    }

    @Override
    public String toString() {
        return "TopologyUpdate{" +
                "affectedHost='" + affectedHost + '\'' +
                ", action=" + action +
                ", updateType=" + updateType +
                ", changeToBeExecuted=" + changeToBeExecuted +
                ", affectedOperatorId='" + affectedOperatorId + '\'' +
                '}';
    }

    public void setAffectedOperatorId(String affectedOperatorId) {
        this.affectedOperatorId = affectedOperatorId;
    }
}
