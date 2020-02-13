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
        Iterator iterator = assignedTasks.iterator();
        while(iterator.hasNext()){
            Task temp = (Task)iterator.next();
			(temp).completeTask();
			addCompletedTask(temp);
            iterator.remove();
		}
    }
    
    public List<Task> getTasksDone(){
        return doneTasks;
    }
	
	public void addCompletedTask(Task completedTask){
        doneTasks.add(completedTask);
	}
    
    public List<Task> getAssignedTasks(){
        return assignedTasks;
    }
    

    public void printTasks(){
        System.out.println(this.getName() + "'s tasks:");
        for(Task temp: assignedTasks){
            System.out.print(temp.getTaskID() + " ");
        }
        System.out.println();
    }


    public void sendOnVacation(Worker del) {
        setDelegate(del);
        setOnVacation(true);
        System.out.println(getName() + " is now on vacation. Tasks have been delegated to " + del.getName());
    }
	
    public void setDelegate(Worker d){
        delegate=d;

        Iterator iterator = assignedTasks.iterator();
        while(iterator.hasNext()){
            d.addTaskToWork((Task)iterator.next());
            iterator.remove();
        }
    }
    
    public void addColleague(Worker c){
        colleagues.add(c);
    }
}
