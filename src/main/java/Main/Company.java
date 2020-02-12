package Main;
import java.util.ArrayList;

public class Company {
    private String name;
    private String address;
    private String owner;
    private ArrayList<Employee> compEmpl= new ArrayList<Employee>();
    
    public Company(String n, String a){
        name=n;
        address=a;
    }

    public void hireNewEmployee(Employee e){
        compEmpl.add(e);
    }
    
    public void sendAnnounce(String n){
        compEmpl.forEach((temp) -> {
            temp.recieveNews(n);
        });
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

    public void add(Company c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
