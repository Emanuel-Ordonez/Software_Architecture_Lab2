package People;
import Main.*;
import Task.*;
import java.util.List;


public class Manager extends Employee{
    private Manager Delegate;
    private List<Manager> colleagues;

    //constructors
    public Manager(){}
    public Manager(String inName){
        setName(inName);
    }
    public Manager(String inName, String inPhone){
        setName(inName);
        setPhone(inPhone);
    }

    public void addWorkerToManager(Worker w){
        
    }
    
    public List<Worker> getWorkers(){
        return null;   
    }
    
    public void assignTask(Task t,Worker w){
        
    }
    
    public List<Worker> collectCompleteTasks(){
        return null;
    }
    
    public void evaluateEmployeesPerformance(){
        
    }
    
    protected void setDelegate(){
        
    }
    
    public void addColleague(Manager c){
        
    }
    
    public void updateSalary(Employee e){
        
    }
}
