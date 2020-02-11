package Main;
import java.io.*;
import People.*;
import Task.*;

public class Driver {
    public static void main(String[] args) {
        
        Owner craig = new Owner("Craig", "####");
        Company company = new Company("Cis","######");
        System.out.println("Company: "+ company.getName());
        System.out.println("Created new owner: " + craig.getName());
        // creates new employees, can change to iterate through a list of names and a for loop
        Manager john = new Manager("John","##");
        Manager mary = new Manager("Mary","##");

        System.out.println("Created new managers: " + john.getName() + " and " + mary.getName());

    }
}
