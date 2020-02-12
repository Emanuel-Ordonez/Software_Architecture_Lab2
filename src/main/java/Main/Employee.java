package Main;


public class Employee extends People {
    private Boolean isOnVacation;
    private int performanceScale;
    private int salary;
    private String news;
    
    public Employee(String inName, String inPhone, int s){
        super(inName,inPhone);
        isOnVacation=false;
        performanceScale=0;
        salary=s;
    }
    
    public void recieveNews(String n){
        System.out.println(name + ": " + n);
        news = n;
    }
    
    public void setSalary(int x){
        salary=x;
    }

    public Boolean getIsOnVacation() {
        return isOnVacation;
    }

    public void setIsOnVacation(Boolean isOnVacation) {
        this.isOnVacation = isOnVacation;
    }

    public int getPerformanceScale() {
        return performanceScale;
    }

    public void setPerformanceScale(int performanceScale) {
        this.performanceScale = performanceScale;
    }
    
}
