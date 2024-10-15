//Termwork 2b

class complex{
    double real,imag;
    
    complex(){
        real=imag=0;
    }
    
    complex(double R,double I){
        real=R;
        imag=I;
    }
    
    complex add(complex c1,complex c2){
        complex res=new complex();
        res.real=c1.real+c2.real;
        res.imag=c1.imag+c2.imag;
        return(res);
    }
    
    complex add(complex c1,int x){
        complex res=new complex();
        res.real=c1.real+x;
        res.imag=c1.imag;
        return (res);
    }
    
    void Display(){
        if(imag<0)
            System.out.println("Resultant complex numbers:"+real+"- i"+imag);
        else{
            System.out.println("Resultant complex numbers:"+real+"+ i"+imag);
        }
    }
    
}
public class ComplexDemo {

    public static void main(String[] args) {
        complex c1=new complex(1,8);
        complex c2=new complex(5,-4);
        
        
        c1.Display(); 
        c2.Display(); 
        
        
        complex result = c1.add(c1, c2);
        result.Display(); 
        
        complex result2 = c1.add(c2, -3);
        result2.Display();
        
       
        
    }
    
}
