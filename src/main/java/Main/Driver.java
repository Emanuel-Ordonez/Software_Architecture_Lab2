package Main;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        
        Owner craig = new Owner("Craig", "####");
        Company company = new Company("ABCCO","######");
        craig.addCompany(company);
        System.out.println("Company: "+ company.getName());
        System.out.println("Owner: " + craig.getName());
        
        
        Manager John = new Manager("John","##");
        Manager Mary = new Manager("Mary","##");
        
        Worker Jack = new Worker("Jack","##");
        Worker Katie = new Worker("Katie","##");
        Worker Amy = new Worker("Amy","##");
        Worker Jim = new Worker("Jim","##");
        Worker Greg = new Worker("Greg","##");
        
        company.hireNewEmployee(John);
        company.hireNewEmployee(Mary);
        
        company.hireNewEmployee(Jack);
        company.hireNewEmployee(Katie);
        company.hireNewEmployee(Amy);
        company.hireNewEmployee(Jim);
        company.hireNewEmployee(Greg);
        
        John.addWorkerToManager(Jack);
        John.addWorkerToManager(Jim);
        Mary.addWorkerToManager(Katie);
        Mary.addWorkerToManager(Amy);
        Mary.addWorkerToManager(Greg);
        
        
        System.out.println("\nAnnouncements to Employees recieved:");
        craig.announceNews("Good Job");
        
        
        Task t1 = new Task(12345, "First Test");
        Task t2 = new Task(12346, "Second Test");
        
        Greg.addTaskToWork(t1);
        Amy.addTaskToWork(t2);
        
        System.out.println();
        
        Amy.setDelegate(Greg);
        Greg.printTasks();
        
        System.out.println("\n");
        
        John.setDelegate(Mary);
        Mary.printWorkers();
    }
}
