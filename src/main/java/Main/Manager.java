package Main;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Manager extends Employee{
    private Manager Delegate;
    private List<Manager> colleagues = new ArrayList<Manager>();
    private List<Worker> manages = new ArrayList<Worker>();
    private List<Project> projectList = new ArrayList<Project>();

    //constructors
    public Manager(String inName, String inPhone){
        super(inName,inPhone,75000);
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
    
    public void evaluateEmployeesPerformance(Worker w){
        int raise = w.getTasksDone().size()*500;
        updateSalary(w, raise);

    }
    
    public void addColleague(Manager c){
        colleagues.add(c);
    }

    public void work(){
        if(isOnVacation()){
            System.out.println(getName() + " is on vacation. Work has been delgated to " + Delegate.getName());
            Delegate.work();
        }
        else {
            Iterator iterator = manages.iterator();
            while (iterator.hasNext()) {
                Worker temp = (Worker) iterator.next();
                evaluateEmployeesPerformance(temp);
            }
        }
    }

    public void updateSalary(Worker w,int raise){
        w.setSalary(raise+ w.getSalary());
        System.out.println(w.getName() + " has completed " + w.getTasksDone().size() + " task(s) and received a raise of $" + raise);
        System.out.println("New salary: " + w.getSalary());
    }
    
    public void printWorkers(){
        System.out.println(this.getName() + " Manages:");
        for(Worker temp: manages){
            System.out.print(temp.getName() + " ");
        }
    }
	
	public void sendOnVacation(Manager del) {
		setDelegate(del);
        setOnVacation(true);
        System.out.println(getName() + " is now on vacation. Tasks have been delegated to " + del.getName());
    }
    
    protected void setDelegate(Manager m){
        Delegate = m;
        for(Worker temp: manages){
            Delegate.addWorkerToManager(temp);
        }
    }
}
