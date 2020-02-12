package Main;
import java.util.*;


public class Worker extends Employee{
    private Worker delegate;
    private List<Worker> colleagues=new ArrayList<Worker>();
    private Manager myManager;
    private List<Task> doneTasks=new ArrayList<Task>();
    private List<Task> assignedTasks=new ArrayList<Task>();

    //constructors
    public Worker(String inName, String inPhone){
        super(inName,inPhone,50000);
    }

    public void addTaskToWork(Task t){
        assignedTasks.add(t);
    }
    
    public void setManager(Manager m){
        myManager=m;
    }
    
    public void performTasks(){
        
    }
    
    public List<Task> getTasksDone(){
        return doneTasks;
    }
    
    public List<Task> getAssignedTasks(){
        return assignedTasks;
    }
    
    public void printTasks(){
        System.out.println(this.name + " tasks:");
        for(Task temp: assignedTasks){
            System.out.print(temp.getTaskID() + " ");
        }
    }
    
    public void setDelegate(Worker d){
        delegate=d;
        for(Task temp: assignedTasks){
            delegate.addTaskToWork(temp);
        }
    }
    
    public void addColleague(Worker c){
        colleagues.add(c);
    }
}
