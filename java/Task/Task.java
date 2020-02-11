package Task;
import Main.*;
import People.*;

public class Task {
    private long taskID;
    private String description;
    private Worker assignedTo;
    private Boolean TaskDone;
    

    public long getTaskID() {
        return taskID;
    }

    public void setTaskID(long taskID) {
        this.taskID = taskID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Worker getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Worker assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Boolean getTaskDone() {
        return TaskDone;
    }

    public void setTaskDone(Boolean TaskDone) {
        this.TaskDone = TaskDone;
    }
}
