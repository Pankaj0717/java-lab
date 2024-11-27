package tw4aPackage;

public class FullTime extends Employee {

    private double da;  
    private double hra; 
    private double it;  
    private double grossSalary;

    
    public FullTime() {
        super();  
        this.da = 0.75; 
        this.hra = 0.075; 
        this.it = 0.10;  
        this.grossSalary = 0;
    }

    
    public FullTime(String name, int age, String address, double basicSalary, String gender) {
        super(name, age, address, basicSalary, gender);  
        this.da = 0.75;  
        this.hra = 0.075;
        this.it = 0.10;  
        this.grossSalary = 0; 
    }

    
    public double calculateSalary() {

        this.grossSalary = basicSalary + (basicSalary * da) + (basicSalary * hra) - (basicSalary * it);
        return grossSalary;
    }

   
    @Override
    public void display() {
        System.out.println("Full-Time Employee Details:");
        super.display(); 
        System.out.println("Gross Salary: ₹" + grossSalary);
    }
}