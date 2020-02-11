package People;
import Main.*;
import Task.*;
import java.util.ArrayList;
import java.util.List;

public class Owner extends People {
    private Company owns;
    private List<Manager> osManager = new ArrayList<Manager>();
    
    
    public Owner(String inName, String inPhone){
        super(inName,inPhone);
    }
    
    public void addCompany(Company c){
        owns=c;
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
    
    public void announceNews(String news){
        owns.sendAnnounce(news); 
    }
}
