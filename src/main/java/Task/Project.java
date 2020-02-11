package Task;
import Main.*;
import People.*;
import java.util.ArrayList;
import java.util.List;


public class Project {
    private String projectName;
    private int status;
    private List<Task> tasklist= new ArrayList<Task>();
    
    public void addTask(Task t){
        tasklist.add(t);
    }
    
    public List<Task> getTasks(){
        return tasklist;
    }
    
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
