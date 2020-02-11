package Main;
import People.*;
import Task.*;
import java.util.List;

public class Company {
    private String name;
    private String address;
    private List<Employee> comEmployees;
    
    public Company(String n, String a){
        name=n;
        address=a;
    }

    public void hireNewEmployee(Employee e){
        comEmployees.add(e);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
