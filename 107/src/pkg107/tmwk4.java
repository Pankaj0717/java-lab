package tmwk4;

import java.util.Scanner;

class AgeException extends Exception {
    AgeException(String msg) {
        super(msg);
    }
}

class LearnerLicenseException extends Exception {  
    LearnerLicenseException(String msg) {
        super(msg);
    }
}

class AccidentException extends Exception {  
    AccidentException(String msg) {
        super(msg);
    }
}

public class tmwk4 {

    static void processApplication(int age, boolean hasValidLL, boolean hasAccident) 
            throws AgeException, LearnerLicenseException, AccidentException {
        
        if (!hasValidLL)
            throw new LearnerLicenseException("Invalid learner's license: user must have a valid learner's license.");
        
        if (age < 18)
            throw new AgeException("Invalid age: user must be above 18 years.");
        
        if (hasAccident)
            throw new AccidentException("Invalid condition: user must have no accidents.");
    }

    public static void main(String[] args) {
       
        Scanner s = new Scanner(System.in);

        try {
            System.out.println("Enter user name:");
            String name = s.nextLine();

            System.out.println("Enter user age:");
            int age = s.nextInt();

            System.out.println("Does user have a valid learner's license (true/false):");
            boolean validLL = s.nextBoolean();

            System.out.println("Has the user had any accidents in the last year (true/false):");
            boolean noOfAccidents = s.nextBoolean();

            
            processApplication(age, validLL, noOfAccidents);
            System.out.println("You are a valid user -> License is issued.");

        } catch (AgeException | LearnerLicenseException | AccidentException ae) {
            System.out.println("User cannot be issued a license.");
            System.out.println(ae.getMessage()); 

        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
            e.printStackTrace();
        } finally {
            s.close(); 
        }
    }
}
