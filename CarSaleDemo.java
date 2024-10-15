package CarSaleDemo;
import java.util.Scanner;
class CarSale {
    
    int sales[][] =new int [6][12];
    //memmber of function
    //read sales data
    Scanner s=new Scanner (System.in);    
    void read_sales(){
        System.out.println("enter the sales data for each car : ");
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<12;j++)
            {
               sales[i][j]=s.nextInt();
            }
        }
    }
    
    void display_Sale()
    {
        System.out.println("sales data for car mfgs");
            for(int i=0;i<6;i++)
            {
                for(int j=0;j<12;j++)
                {
                    System.out.print(sales[i][j]);
                    System.out.println("\t");
                }//inner for  loop 
                System.out.println("\n");
            }//outer for loop
    }

    void avg_sales(){
        int total;
        for(int i=0;i<6;i++){
            total=0;
            for(int j=0;j<12;j++){
                total+=sales[i][j];
            }
            System.out.println("Averge sale for manufacturer" + i+ "is :"+ (total/12));
        }
    }
     void total_sales(){
        System.out.println();
        int total;
        for(int i=0;i<6;i++){
            total=0;
            for(int j=0;j<12;j++){
                total+=sales[i][j];
            }
            System.out.println("Total sales for manufacturer " + i +" is: "+total);
        }
     }

    void month_sales(){
        System.out.println();
        int msales;
        for(int i=0;i<12;i++){
            msales=0;
            for(int j=0;j<6;j++){
                msales=msales+sales[j][i];
            }
            System.out.println("month sales for manufacturer " +i+ "is : "+msales);
        }
    }
    
        void max_sales(){
            int mfgr,max=-1,month =0;
            System.out.println("enter car mfgr");
            mfgr =s.nextInt();
            for(int i=0;i<12;i++)
            {
                if(sales[mfgr][i]>max){
                    max=sales[mfgr][i];
                    month=i+1;
                }    
            }
            System.out.println(" month is :" +month);
    }

}
public class CarSaleDemo{
    public static void main(String args[]){
        CarSale MS = new CarSale();
        MS.read_sales();
        MS.display_Sale();
        MS.avg_sales();
        MS.total_sales();
        MS.month_sales();
        MS.max_sales();
    }
}
        
 
    

