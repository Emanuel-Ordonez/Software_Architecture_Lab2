package Main;

public class Task {
    private long taskID;
    private String description;
    private Boolean TaskDone;
    
    public Task(long ID, String d){
        taskID=ID;
        description=d;
        TaskDone = false;
    } 
    
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

    public Boolean getTaskDone() {
        return TaskDone;
    }

    public void setTaskDone(Boolean TaskDone) {
        this.TaskDone = TaskDone;
    }
}
