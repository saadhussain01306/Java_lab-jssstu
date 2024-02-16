/* Given that an EMPLOYEE class contains the following members: 
Members: Employee ID, Employee Name, Department name & Basic Pay 
Methods: To read each employee details, to calculate Gross Pay and to print the employee 
details. Develop an application to read data of N employees and compute the Gross Pay 
and Net Pay of each employee. 
Gross Pay = Basic Pay + DA + HRA (DA = 58% of Basic Pay, HRA = 16% of Basic Pay) 
Net Pay = Gross – Income Tax 
Income Tax calculated as follows: 
Gross Pay - Up to 2 lakhs – Nil 
Above 2 and up to 3 lakhs - 10% of the Gross Pay 
Above 3 and up to 5 lakhs - 15% of the Gross Pay and 
Above 5 lakhs 30 % of the Gross Pay, an additional charge of 2% of the tax will be added 
to total tax */
import java.util.*;

class employee{
    int id;
    String name,dept;
    float basicpay,grosspay,netpay,tax;
    Scanner in =new Scanner(System.in);
    
    void read(){
        System.out.println("Enter the name of the employee");
        name=in.next();
        System.out.println("enter the employee ID");
        id=in.nextInt();
        System.out.println("enter th employee department");
        dept=in.next();
        System.out.println("Enter the basic pay of the employee");
        basicpay=in.nextFloat();
        
    }
    
    void grosspay(){
        float da=0.58F*basicpay;
        float hra=0.16F*basicpay;
        grosspay=basicpay+da+hra;
    }
    
    void netpay(){
        employee emp= new employee();
        emp.grosspay();
       
        if(grosspay<=200000){
            tax=0;
        }
        else if(grosspay>200000 && grosspay<=300000){
            tax=0.10F*grosspay;
        }
        else if(grosspay>300000 && grosspay<=500000){
            tax=0.15F*grosspay;
        }
        
        else if(grosspay>500000){
            tax=0.30F*grosspay;
            float addtax=0.02F*tax;
            tax=tax+addtax;
        }
        
        netpay=grosspay-tax;
    }
    
    void display(){
        employee emp=new employee();
        emp.grosspay();
        emp.netpay();
        System.out.println(id+"\t\t"+name+"\t\t"+dept+"\t\t"+basicpay+"\t\t"+grosspay+"\t\t"+netpay);
    
        
    }
    
}

public class Main{
    public static void main(String X[]){
        Scanner in =new Scanner(System.in);
        int i,ch,n;
        System.out.println("Enter the number of employee");
        n=in.nextInt();
        employee e[]=new employee[n];
        do{
            System.out.println("Mainmenu\n1.Read\n2.display\n3.Exit\n");
            System.out.println("Enter your choice");
            ch=in.nextInt();
            switch(ch){
               
                case 1: System.out.println("enter the "+n+"employee details");
                    for(i=0;i<n;i++){
                         e[i]=new employee();
                    System.out.println("employee"+(i+1));
                      e[i].read();
                           }
                    break;
                    
                case 2:
                    System.out.println("The entered details are");
                    System.out.println("Id\t\tName\t\tDepartment\t\tBasic pay\tGRoss pay\t\tNet pay");
                    for(i=0;i<n;i++){
                        
                        e[i].grosspay();
                        e[i].netpay();
                        e[i].display();
                    }
                    break;
                case 3:break;
                
                default :System.out.println("Enter a proper choice");
                break;
                
            }
        }while(ch!=3);
    }
}
