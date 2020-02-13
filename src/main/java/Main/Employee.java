package Main;


public class Employee extends People {
    private Boolean isOnVacation;
    //private int performanceScale;
    private int salary;
    private String news;
    
    public Employee(String inName, String inPhone, int s){
        super(inName,inPhone);
        isOnVacation=false;
        //performanceScale=0;
        salary=s;
    }
    
    public void recieveNews(String n){
        System.out.println(getName() + ": " + n);
        news = n;
    }

    public int getSalary(){
        return salary;
    }
    
    public void setSalary(int x){
        salary=x;
    }

    public Boolean isOnVacation() {
        return isOnVacation;
    }

    public void setOnVacation(Boolean vaca) {
        isOnVacation = vaca;
    }

    //public int getPerformanceScale() {
    //    return performanceScale;
    //}

    //public void setPerformanceScale(int performanceScale) {
    //    this.performanceScale = performanceScale;
    //}
    
}
