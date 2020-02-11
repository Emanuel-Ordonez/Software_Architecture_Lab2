package Main;
import java.io.*;
import People.*;
import Task.*;

public class Driver {
    public static void main(String[] args) {
        
        Owner craig = new Owner("Craig", "####");
        Company company = new Company("Cis","######");
        craig.addCompany(company);
        System.out.println("Company: "+ company.getName());
        System.out.println("Created new owner: " + craig.getName());
        
        // creates new employees, can change to iterate through a list of names and a for loop
        Manager john = new Manager("John","##");
        Worker mary = new Worker("Mary","##");
        
        company.hireNewEmployee(john);
        company.hireNewEmployee(mary);
        
       
        
        craig.announceNews("What up Empolyees");
    }
}
