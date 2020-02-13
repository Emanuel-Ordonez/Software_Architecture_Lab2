package Main;

public class Task {
    private long taskID;
    private String description;
    private Boolean taskDone;
    
    public Task(long ID, String d){
        taskID=ID;
        description=d;
        taskDone = false;
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

    public Boolean taskCompleted() {
        return taskDone;
    }

    public void completeTask() {
		System.out.println("Task: " + taskID + " completed");
        taskDone = true;
    }
}
