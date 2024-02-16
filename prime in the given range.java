import java.util.*;
import java.util.Scanner;

public class Main{
    public static void main(String x[]){
        int n1,n2,i,j,flag;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the lower range");
        n1=in.nextInt();
        System.out.println("enter the higher range");
        n2=in.nextInt();
        System.out.println("The prime number in the range is :");
        for(i=n1;i<=n2;i++){
            if(i==1 || i==0){
                continue;
            }
            flag=0;
            for(j=2;j<=(i/2);j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.print(i+" ");
            }
        }
        
    }
}
