package People;
import Main.*;
import Task.*;
import java.util.List;

public class Owner extends People {
    private List<Company> owns;
    private List<Manager> osManager;
    
    
    public Owner(String inName, String inPhone){
        super(inName,inPhone);
    }

    private void createProject(){
    
    }
    
    public void startProject(){
        
    }
    
    public void assignProject(Manager m, Project p){
        m.getAssignedProject(p);
    }
    
    public void updateSalary(Manager m){
        
    }
    
    public void announceNews(){
        
    }
}
