import java.util.*;

public class Main{
    public static void mergeArrays(int []A,int[]B, int n1 ,int n2, int []C){
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(A[i]<B[j]){
                C[k++]=A[i++];
            }
            else{
                C[k++]=B[i++];
            }
        }
        while(i<n1){
            C[k++]=A[i++];
        }
        while(j<n2){
            C[k++]=B[j++];
        }
    }
    
    public static void main(String x[]){
        Scanner in =new Scanner(System.in);
        int i;
        System.out.println("enter the number of elements in the array-1");
        int n1=in.nextInt();
        int []A=new int[n1];
        System.out.println("Enter the "+n1+"elements of array-1:");
        for(i=0;i<n1;i++){
            A[i]=in.nextInt();
        }
       System.out.println("enter the number of elements in the array-2");
        int n2=in.nextInt();
        int []B=new int[n2];
         System.out.println("Enter the "+n2+"elements of array-2:");
        for(i=0;i<n2;i++){
            B[i]=in.nextInt();
        }
        
        int []C=new int[n1+n2];
        mergeArrays(A,B,n1,n2,C);
        System.out.println("The sorted array is:");
        for(i=0;i<(n1+n2);i++){
            System.out.print(C[i]+" ");
        }
        
        
        
        
            }
}
