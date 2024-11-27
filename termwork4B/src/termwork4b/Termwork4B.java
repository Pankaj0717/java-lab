package termwork4b;;
import java.util.Scanner;
class AgeException extends Exception{
    AgeException(String msg){
        super(msg);
    }
}
class learnerLiscensException extends Exception{
    learnerLiscensException(String msg){
        super(msg);
    }
}
class AcceidentException extends Exception{
    AcceidentException(String msg){
        super(msg);
    }
}

public class Termwork4B {
    static void processApplication(int age,boolean VLL,boolean NOA) throws  AgeException,learnerLiscensException,AcceidentException
    {
        if(age<18)
           throw new AgeException ("invalid age: user must be above 18 years ");
         if(!VLL)
              throw new learnerLiscensException ("invalid learner's licens  : user must have valid lernaers licens ");
         if(!NOA)
          throw new  AcceidentException  ("invalid condition : user must have no accident");   
    }
     public static void main(String[] args) {
        // TODO code application logic here
        String name;
        boolean no_of_accd,valid_LL;
        int age;
        Scanner s=new Scanner(System.in);
       
         try{ 
             
        System.out.println("Enter user name");
         name=s.nextLine();
         
         System.out.println("Enter user age");
         age =s.nextInt();
         
         System.out.println("Does user have valid learner liscens(true/false):");
         valid_LL =s.nextBoolean();
         
         System.out.println("Does user makes acceident(true/false):");
         no_of_accd =s.nextBoolean();
         
         processApplication(age,valid_LL,no_of_accd);
         }
         catch(AgeException |learnerLiscensException |AcceidentException ae){
             
             System.out.println("User cannot be Issued Liscens");
             System.out.println(ae.getMessage());
  
         }
         catch(Exception e){
             System.out.println("other Eception are:");
         }
    }//end of main
      
    
}
