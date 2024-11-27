package tw4aPackage;

public class PartTime extends Employee {

    private String qualification;
    private int experience;
    private int workingHours;
    private double ratePerHour;
    private double totalSalary;

    public PartTime() {
        super();
        this.qualification = "";
        this.experience = 0;
        this.workingHours = 0;
        this.ratePerHour = 0;
        this.totalSalary = 0;
    }

    public PartTime(String name, int age, String address, String gender, 
                    String qualification, int experience, int workingHours) {
        super(name, age, address, 0, gender);
        this.qualification = qualification;
        this.experience = experience;
        this.workingHours = workingHours;
        this.ratePerHour = calculateRatePerHour();
        this.totalSalary = 0;
    }

    private double calculateRatePerHour() {
        double rate = 0;
        
        if (experience >= 1 && experience <= 5) {
            if (qualification.equalsIgnoreCase("BE") || qualification.equalsIgnoreCase("BTech")) {
                rate = 300;
            } else if (qualification.equalsIgnoreCase("MTech")) {
                rate = 500;
            } else if (qualification.equalsIgnoreCase("PhD")) {
                rate = 800;
            }
        } else if (experience >= 6 && experience <= 10) {
            if (qualification.equalsIgnoreCase("BE") || qualification.equalsIgnoreCase("BTech")) {
                rate = 400;
            } else if (qualification.equalsIgnoreCase("MTech")) {
                rate = 700;
            } else if (qualification.equalsIgnoreCase("PhD")) {
                rate = 1700;
            }
        } else if (experience > 10) {
            if (qualification.equalsIgnoreCase("BE") || qualification.equalsIgnoreCase("BTech")) {
                rate = 500;
            } else if (qualification.equalsIgnoreCase("MTech")) {
                rate = 1000;
            } else if (qualification.equalsIgnoreCase("PhD")) {
                rate = 1500;
            }
        }
        return rate;
    }

    public double calculateSalary() {
        this.totalSalary = ratePerHour * workingHours;
        return totalSalary;
    }

    @Override
    public void display() {
        System.out.println("Part-Time Employee Details:");
        super.display();
        System.out.println("Qualification: " + qualification);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Working Hours: " + workingHours + " hours");
        System.out.println("Rate per Hour: ₹" + ratePerHour);
        System.out.println("Total Salary: ₹" + totalSalary);
    }
}