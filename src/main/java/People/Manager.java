package People;
import Main.*;
import Task.*;
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
    
    //override function - managers receive news and then push it to all employees they oversee.
    /*public void recieveNews(String n){
	System.out.println("Manager " + name + " has received the message: " + n);
		
	//iterates through list of employees and passes on news
	for (Worker temp : manages){
            receiveNews(n);
	}*/
}
