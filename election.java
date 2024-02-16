import java.util.*;

public class Main{
    public static void main(String x[]){
        Scanner in =new Scanner(System.in);
        int []c={0,0,0,0,0};
        int spoilt=0;
        int ch;
        System.out.println("1.Candidate-1\n2.Candidate-3\n3.Candidate-3\n4.Candidate-4\n5.Candidate-5\n0.To get the result\n");
        do{
            System.out.print("Enter the No. to vote the cnadidate");
            ch=in.nextInt();
            switch(ch){
                case 1:c[0]++;break;
                case 2:c[1]++;break;
                case 3:c[2]++;break;
                case 4:c[3]++;break;
                case 5:c[4]++;break;
                default:spoilt++;break;
            }
            
        }while(ch!=0);
        
        System.out.println("--RESULT--");
        System.out.println("Candidate-1:"+c[0]+"votes\nCandidate-2:"+c[1]+"Candidate-3:"+c[2]+"votes\n"+"Candidate-4:"+c[3]+"votes\n"+"Candidate-5:"+c[4]+"votes\n"+"Spoilt:"+(spoilt-1)+"votes");
        
        
        

    }
}
