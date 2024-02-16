import java.util.*;
import java.util.Scanner;

class Main{
    public static void mergesort(int []A,int []B,int n1,int n2,int [] C){
        int i,j,k;
        i=0;
        j=0;
        k=0;
        while(i<n1 && j<n2){
            if(A[i]<B[j]){
                C[k++]=A[i++];
                
            }
            else{
                C[k++]=B[j++];
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
        Scanner in = new Scanner(System.in);
       int n1,n2,i,k,j;
       System.out.println("enter the number of elemnts present in the 1st array");
       n1=in.nextInt();
       int []A=new int [n1];
       System.out.println("enter the"+n1+"elements one by one");
       for(i=0;i<n1;i++) {   
        A[i]=in.nextInt();
       }
        System.out.println("enter the number of elemnts present in the 2nd array");
       n2=in.nextInt();
       int []B=new int [n2];
       System.out.println("enter the"+n2+"elements one by one");
       for(i=0;i<n2;i++) {   
        B[i]=in.nextInt();
       }
       
       int []C=new int[n1+n2];
        mergesort(A,B,n1,n2,C);
        
        System.out.println("The sorted array of merging the two arrays are");
        for( k=0;k<(n1+n2);k++){
            System.out.print(C[k]+" ");
        }
        
    }
}
