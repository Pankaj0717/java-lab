
package tw4aPackage;


public class Emp_Demo {
    public static void main(String args[]){
        FullTime FT=new FullTime("Pankaj",27,"Goa",5000,"Male");
        FT.calculateSalary();
        FT.display();
        
        PartTime PT=new PartTime("Mayur",27,"Goa","Male","BE",6,12);
        PT.calculateSalary();
        PT.display(); 
    }
}


