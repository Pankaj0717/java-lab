
package tw4b;

import java.util.Scanner;

class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}

class LlException extends Exception{
    LlException(String msg){
        super(msg);
    }
}

class AccidentException extends Exception{
    AccidentException(String msg){
        super(msg);
    }
}


public class Tw4b {
    static void ProcessApplication(int age,boolean VLL,boolean Acc) throws AgeException,LlException,AccidentException{
        if(age<18){
            throw new AgeException("Invalid Age:");
        }
        if(!VLL){
            throw new LlException("Invalid Learning Liscence");
        }
        if(!Acc){
            throw new AccidentException("User may have accident in last year");
        }
    }
    public static void main(String[] args) {
        String name;
        boolean no_of_accd,valid_LL;
        int age;
        
        Scanner s=new Scanner(System.in);
        try{
            System.out.println("Enter User's name:");
            name=s.nextLine();

            System.out.println("Enter User's age:");
            age=s.nextInt();

            System.out.println("Do you have valid learning liscence:");
            valid_LL=s.nextBoolean();

            System.out.println("You have no accident records in last one year:");
            no_of_accd=s.nextBoolean();
            
            ProcessApplication(age,valid_LL,no_of_accd);
                System.out.println("You are a valid user --> LICENSE APPROVED");
        }
        catch (AgeException | LlException | AccidentException ae)
        {
            System.out.println("User cannot be issued Permanent License.");
            System.out.println(ae.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Other exception occured");
        }

        
    }
    
}
