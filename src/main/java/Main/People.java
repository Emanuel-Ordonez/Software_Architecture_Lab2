package Main;

public class People {
    private String name;
    private String phone;

    //constructors
       
    public People(String n, String p){
        name=n;
        phone=p;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
}
