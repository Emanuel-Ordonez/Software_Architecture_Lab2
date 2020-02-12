package Main;
import java.util.ArrayList;
import java.util.List;


public class Manager extends Employee{
    private Manager Delegate;
    private List<Manager> colleagues = new ArrayList<Manager>();
    private List<Worker> manages = new ArrayList<Worker>();
    private List<Project> projectList = new ArrayList<Project>();

    //constructors
    public Manager(String inName, String inPhone){
        super(inName,inPhone);
    }

    public void addWorkerToManager(Worker w){
        manages.add(w);
        w.setManager(this);
    }
    
    public List<Worker> getWorkers(){
        return manages;   
    }
    
    public void getAssignedProject(Project p){
        //projectList.add(p);
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
    
    public void addColleague(Manager c){
        colleagues.add(c);
    }
    
    public void updateSalary(Employee e,int salary){
        e.setSalary(salary);
    }
    
    public void printWorkers(){
        System.out.println(this.name + " Manages:");
        for(Worker temp: manages){
            System.out.print(temp.getName() + " ");
        }
    }
    
    protected void setDelegate(Manager m){
        Delegate = m;
        for(Worker temp: manages){
            Delegate.addWorkerToManager(temp);
        }
    }
}
