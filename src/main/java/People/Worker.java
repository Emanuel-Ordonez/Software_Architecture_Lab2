package People;
import Main.*;
import Task.*;
import java.util.*;


public class Worker extends Employee{
    private Worker delegate;
    private List<Worker> colleagues;
    private Manager myManager;
    private List<Task> doneTasks;
    private List<Task> assignedTasks;

    //constructors
    public Worker(String inName, String inPhone){
        super(inName,inPhone);
    }

    public void addTaskToWork(Task t){
        assignedTasks.add(t);
    }
    
    public void performTasks(){
        
    }
    
    public List<Task> getTasksDone(){
        return doneTasks;
    }
    
    public List<Task> getAssignedTasks(){
        return assignedTasks;
    }
    
    protected void setDelegate(){
        
    }
    
    public void addColleague(Worker c){
        colleagues.add(c);
    }
}
