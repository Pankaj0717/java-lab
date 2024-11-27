package tw4aPackage;

public class Employee {
    protected String name;
    protected String address;
    protected int age;
    protected double basicSalary;
    protected String gender;
        
Employee(){
    this.name=null;
    this.address=null;
    this.age=0;
    this.basicSalary=0;
    this.gender=null;
}

Employee(String name, int age, String address, double basicSalary, String gender) {
  this.name = name;
        this.age = age;
        this.address = address;
        this.basicSalary = basicSalary;
        this.gender = gender;
    }

public void display() {
        System.out.println(" Employee Details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + gender);
        System.out.println("Basic Salary: ₹" + basicSalary);
    }
    
}

