import java.util.*;



class account{
    String name;
    long acc_num;
    String acc_type;
    double amt;
    Scanner in = new Scanner(System.in); 
    
    void read(){
        System.out.println("enter the name of the account holder");
        name=in.next();
        System.out.println("Enter the account number of the account holder ");
        acc_num=in.nextLong();
        System.out.println("Enter the type of account of the account holder ");
        acc_type=in.next();
        System.out.println("Enter the balance in the account of the account holder");
        amt=in.nextDouble();
        
    }
    void deposit(){
        System.out.println("Enter the amount to be deposited");
        double d=in.nextDouble();
       
        amt=amt+d;
         System.out.println("The balance now is\n"+amt);
    }
    void withdraw(){
        System.out.println("Enter the amount to be withdrawn");
        double w=in.nextDouble();
        if(w<=amt){
           amt=amt-w;
         System.out.println("The balance now is\n"+amt);
        }
        else{
            System.out.println("Aukat bhoolgaya apni");
        }
    }
    
    void display(){
        System.out.println("Name of the account holder = "+name);
        System.out.println("The balance is = "+amt);
    }
    
   
}
class Main{
    public static void main(String x[]){
        Scanner in = new Scanner(System.in);
        account a[]= new account[5];
        for(int i=0;i<5;i++){
            a[i]= new account();
            System.out.println("the details of the "+(i+1)+" customer");
            a[i].read();
            System.out.println();
            a[i].deposit();
            System.out.println();
            a[i].withdraw();
            System.out.println();
            a[i].display();
            
        }
    }
}
