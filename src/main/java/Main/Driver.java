package Main;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        
		// part a
        Owner craig = new Owner("Craig", "####");
        Company company = new Company("ABCCO","######");
        craig.addCompany(company);
        System.out.println("Company: "+ company.getName());
        System.out.println("Owner: " + craig.getName());
        
        
        Manager john = new Manager("John","##");
        Manager mary = new Manager("Mary","##");
        
        Worker jack = new Worker("Jack","##");
        Worker katie = new Worker("Katie","##");
        Worker amy = new Worker("Amy","##");
        Worker jim = new Worker("Jim","##");
        Worker greg = new Worker("Greg","##");
        
        company.hireNewEmployee(john);
        company.hireNewEmployee(mary);
        
        company.hireNewEmployee(jack);
        company.hireNewEmployee(katie);
        company.hireNewEmployee(amy);
        company.hireNewEmployee(jim);
        company.hireNewEmployee(greg);
        
        john.addWorkerToManager(jack);
        john.addWorkerToManager(jim);
        mary.addWorkerToManager(katie);
        mary.addWorkerToManager(amy);
        mary.addWorkerToManager(greg);
        
		// part b
		// announcement
        System.out.println("\nAnnouncements to Employees recieved:");
        craig.announceNews("Good Job");
        
		/* Amy delegates her task to Greg. 
		Per the explanation, delegation only occurs when an employee goes on vacation
		Delegation should be added to any/all tasks 
		
		*/

        Task t1 = new Task(343, "First Test");
        Task t2 = new Task(12346, "Second Test");
        greg.addTaskToWork(t1);
        amy.addTaskToWork(t2);
        amy.printTasks();
        greg.printTasks();

        // Sends Amy on vacation and delegates tasks to greg
        amy.sendOnVacation(greg);
        amy.printTasks();
        greg.printTasks();

        // Greg performs tasks
        greg.performTasks();
		
        mary.sendOnVacation(john);
        mary.work();


		/*Old Code

        
        System.out.println();
        
        Amy.setDelegate(Greg);
        Greg.printTasks();
        
        System.out.println("\n");
        
        John.setDelegate(Mary);
        Mary.printWorkers();
		*/
    }
}
