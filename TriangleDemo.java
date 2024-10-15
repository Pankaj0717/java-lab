import java.util.Scanner;

class myTriangle{
        //data members
        double S1,S2,S3,area;
        void init(){
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the side of the Triangle");
            S1=s.nextDouble();
            S2=s.nextDouble();
            S3=s.nextDouble();
        }
                
                
        void type(){
            if((S1==S2)&&(S2==S3))
                System.out.println("Equilateral Triangle");        
            else if((S1==S2)||(S2==S3)||(S3==S1))   
                System.out.println("Isosceles Triangle");
            else   
                System.out.println("Scalene Triangle");        
        }         
                 
        void FindArea(){
            double S=(S1+S2+S3)/2;
            if(((S1+S2)<S3)||((S2+S3)<S1)||((S3+S1)<S2))
            {
                System.out.println("ERROR!!   Triangle cannot be formed");  
            } 
            else{
                area=Math.sqrt(S*(S-S1)*(S-S2)*(S-S3));
                display();
            }
                       
        }
                
        void display(){
            System.out.println("Area of the triangle is:"+area);
        }
}


public class TriangleDemo {
    public static void main(String args[]){
    myTriangle T1=new myTriangle();//creating a object
        T1.init();
        T1.type();
        T1.FindArea();
        
        
    }
}