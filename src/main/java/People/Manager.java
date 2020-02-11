package People;
import Main.*;
import Task.*;
import java.util.List;


public class Manager extends Employee{
    private Manager Delegate;
    private List<Manager> colleagues;
    private List<Worker> manages;
    private List<Project> projectList;

    //constructors
    public Manager(String inName, String inPhone){
        super(inName,inPhone);
    }

    public void addWorkerToManager(Worker w){
        manages.add(w);
    }
    
    public List<Worker> getWorkers(){
        return manages;   
    }
    
    public void getAssignedProject(Project p){
        projectList.add(p);
    }
    
    public void assignTask(Task t,Worker w){
        w.addTaskToWork(t);
    }
    
    public List<Task> collectCompleteTasks(){
        return null;
    }
    
    public void evaluateEmployeesPerformance(Employee e, int ev){
        e.setPerformanceScale(ev);
    }
    
    protected void setDelegate(Manager m){
        Delegate = m;
    }
    
    public void addColleague(Manager c){
        colleagues.add(c);
    }
    
    public void updateSalary(Employee e,int salary){
        e.setSalary(salary);
    }
}
