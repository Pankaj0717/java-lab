
import java.util.Scanner;

class Triangle{
    double S1,S2,S3,area;
    
    void init(){
        Scanner s=new Scanner(System.in);
        S1=s.nextDouble();
        S2=s.nextDouble();
        S3=s.nextDouble();        
    }
}
class TriangleDemo2 {
    public static void main(String args[]){
        myTriangle T1=new myTriangle();
        T1.init();
    }
}
