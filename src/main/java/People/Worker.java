package People;
import Main.*;
import Task.*;
import java.util.*;


public class Worker extends Employee{
    private Worker delegate;
    private List<Worker> colleagues;

    //constructors
    public Worker(){}
    public Worker(String inName){
        setName(inName);
    }
    public Worker(String inName, String inPhone){
        setName(inName);
        setPhone(inPhone);
    }

    private void addtaskToWork(Task t){
    
    }
    
    private void performTasks(){
    
    }
    
    private void getTasksDone(){
    
    }
    
    private void getAssignedTasks(){
    
    }
    
    protected void setDelegate(){
    
    }
    
    private void addColleague(Worker c){
    
    }
}
