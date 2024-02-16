import java.util.*;
import java.util.Scanner;

class CUBE{
    int vol,out_vol,i;
    int []a= new int[3];
    Scanner in = new Scanner(System.in);
    void read(){
        for(i=0;i<3;i++){
            System.out.print("Enter the length of the cube-"+(i+1)+":");
            a[i]=in.nextInt();
        }
    }
    
    void print(){
        for(i=0;i<3;i++){
            vol=a[i]*a[i]*a[i];
            out_vol=6*a[i]*a[i];
            System.out.println("The volume of cube-"+(i+1)+"="+vol);
            System.out.println("the outer volume of the cube-"+(i+1)+"="+out_vol);
        }
    }
    
}

public class Main{
    public static void main(String x[]){
        CUBE cube=new CUBE();
        cube.read();
        cube.print();
    }
}
