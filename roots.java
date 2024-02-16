import java.util.*;
import java.util.Scanner;

class Main{
    public static void main(String x[]){
        double a,b,c,d,r1,r2,img,real;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the non-zero coeffiecients a,b,c respectively");
        a=in.nextDouble();
         b=in.nextDouble();
          c=in.nextDouble();
          d=(b*b)-(4*a*c);
          if(d>0){
              System.out.println("The roots are real and distinct");
              r1=(-b+Math.sqrt(d))/(2*a);
               r2=(-b-Math.sqrt(d))/(2*a);
               System.out.println("Root-1="+r1);
               System.out.println("Root-2="+r2);
              
          }
          else if(d==0){
              System.out.println("The roots are real and equal");
              r1=r2=(-b)/(2*a);
              System.out.println("Root-1=Root-2="+r1);
          }
          else{
              System.out.println("The roots are imaginary");
              real=(-b)/(2*a);
              img=Math.sqrt(-d)/(2*a);
              System.out.println("Root1 ="+real+"+"+img+"i");
              System.out.println("Root2 ="+real+"-"+img+"i");
          }
    }
}
