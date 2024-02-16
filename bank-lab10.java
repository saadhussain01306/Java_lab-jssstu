/*10. Develop an application with an abstract Bank class consisting of below 
features: 
a) Bank_Type (National/International)
b) getRoi() is an abstract method
c) deposit() d) offerCreditCard 
• Identify various (atleast 4) banks which will extend bank class with below 
conditions:
o If the bank is type of nationalized the roi is 7% else 8%. The interest is 
offered only if the term deposit is minimum of 3 years. 
o If the bank is international, then it can offer platinum credit card otherwise 
not. 
Override one of the method and use the concept of dynamic method dispatch.*/

import java.util.*;

abstract class bank{
    char bankType;
    double amount,interest;
    boolean platinumCard;
    boolean offerCreditcard;
    
    abstract void getRoi();
    
    void deposit(){
        bankType='v';
        amount=0.00;
        interest=0.0;
        platinumCard=false;
        
    }
    
}

class bankDetails extends bank{
    Scanner in = new Scanner(System.in);
    double termDeposit=0;
    int term=0;
    void getRoi(){
    if(bankType=='n'){
        platinumCard=false;
        if(term>=3){
        interest=0.7*termDeposit;
        }
    }
    else{
        platinumCard=true;
         if(term>=3){
        interest=0.8*termDeposit;
         }
    }
    }
void deposit(){
    System.out.println("Enter the type of bank\ni=international Bank\nn=national bank\n");
    bankType=in.next().charAt(0);
    if(bankType=='n'|| bankType=='i'){
         System.out.println("Enter tyhe amount to be deposited");
         termDeposit=in.nextDouble();
          System.out.println("Enter the term to which the amount has to be deposited");
          term=in.nextInt();
          getRoi();
    }
    else{
         System.out.println("invalid bank type");
    }
    }
    
    
    void display(){
        String bank;
        
        if(bankType=='i'){
            bank="international";
        }
        else if(bankType=='n'){
            bank="national";
        }
        else{
             bank="Inavlid";
        }
        
         System.out.println("Type of bank:"+bank);
          System.out.println("interest:"+interest);
           if(platinumCard){
                System.out.println("Eligible for platinum card");
                
           }
           else{
                System.out.println("Not eligible for platinum card");
           }
    }
}

public class Main{
    public static void main(String x[]){
    int n;
        Scanner in =new Scanner(System.in);
         System.out.println("Enter the number of banks");
         n=in.nextInt();
         bankDetails []b=new bankDetails[n];
         for(int i=0;i<n;i++){
             b[i]=new bankDetails();
              System.out.println("enter the details of bank-"+(i+1));
              b[i].deposit();
         }
         
         for(int i=0;i<n;i++){
             System.out.println("The details of the bank "+(i+1));
             b[i].display();
             
         }
    }
}
    
