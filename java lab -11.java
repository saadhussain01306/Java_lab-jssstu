import java.util.*;

class student{
    int rollNumber;
    
    void readNumber(int n){
        rollNumber=n;
    }
    
    void printnumber(){
        System.out.println("Roll No:"+rollNumber);
    }
}

class test extends student{
    int sub1,sub2;
    
    void readmarks(int m1,int m2){
        sub1=m1;
        sub2=m2;
    }
    
    void printmarks(){
         System.out.println("Marks in Subject-1:"+sub1);
         System.out.println("Marks in subject-2:"+sub2);
         }
}


interface sports{
    void readWt(double n);
    void printWt();
}

class result extends test implements sports {
    
    double total,sportWt;
    
    public void readWt(double n){
        sportWt=n;
    }
    
    public void printWt(){
        System.out.println("Sports weightage is:"+sportWt);
    }
    
    void display(){
        
        total=sub1+sub2+sportWt;
        printnumber();
        
        printmarks();
        
        printWt();
        
        System.out.println("Total score: "+total);
    }
}

public class Main{
    public static void main(String x[]){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of students :");
        n=in.nextInt();
        
        result []student= new result[n];
        
        for(int i=0;i<n;i++){
            student[i]=new result();
            System.out.println("Enetr the dtails of the student-"+(i+1));
            System.out.println("Enter the roll number\n");
            student[i].readNumber(in.nextInt());
            System.out.println("Enter the marks in subject-1");
            int m1=in.nextInt();
            System.out.println("Enter the marks in subject-2");
            int m2=in.nextInt();
            student[i].readmarks(m1,m2);
            System.out.println("enter the sports weightage");
            student[i].readWt(in.nextDouble());
        }
        
        for(int i=0;i<n;i++){
            System.out.println("Details of the student-"+(i+1));
            student[i].display();
        }
    }
}
