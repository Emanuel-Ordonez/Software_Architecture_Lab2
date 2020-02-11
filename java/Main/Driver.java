package Main;
import java.io.*;
import People.*;
import Task.*;

public class Driver {
    public static void main(String[] args) {
        
        Owner craig = new Owner("Craig", "####");
        Company company = new Company("ABCCO","######");
        System.out.println("Company: "+ company.getName());
        System.out.println("Created new owner: " + craig.getName());
        // creates new employees, can change to iterate through a list of names and a for loop
		// needs to change from creating new objects to utilizing the owner.hireNewEmployee() function
        Manager john = new Manager("John","##");
        Manager mary = new Manager("Mary","##");

        System.out.println("Created new managers: " + john.getName() + " and " + mary.getName());
		
		Worker jack = new Worker("Jack", "##", john);
		Worker jim = new Worker("Jim", "##", john);
		
		Worker katie = new Worker("Katie", "##", mary);
		Worker amy = new Worker("Katie", "##", mary);
		Worker greg = new Worker("Katie", "##", mary);
		
		// Announcing message
		craig.announceNews("Good Job");
		
		
    }
}
