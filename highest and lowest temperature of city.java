import java.util.*;

public class Main{
    public static void main(String x[]){
        Scanner in =new Scanner(System.in);
        City[] city=new City[5];
        for(int i=0;i<5;i++){
            city[i]=new City();
            
        }
        for(int i=0;i<5;i++){
            System.out.print("enter the details of city-"+(i+1)+":");
            city[i].read();
            city[i].cal();
        }
        
        int ch=0;
        int ctn;
        while(ch!=2){
            System.out.print("Press 1 for display and 2.for exit");
            ch=in.nextInt();
            if(ch==1){
            System.out.print("Enter the city no:");
            ctn=in.nextInt();
                if(ctn>5 || ctn<0){
                    System.out.print("enter the valid city number ");
                }
                else{
                    city[ctn-1].display();
                }
            }
            else if(ch==2){
                break;
            }
            else{
                System.out.print("enter a valid choice");
            }
        
        }
        in.close();
    }
}

class City{
    int hd,ld;
    int []t=new int[6];
    int i;
    String name;
    int high,low;
     Scanner in =new Scanner(System.in);
    public void read(){
        System.out.print("enter the name of the city\n");
        name=in.next();
    for(i=0;i<6;i++){
        System.out.print("enter the temperature on Jan"+(i+1)+":");
        
        t[i]=in.nextInt();
    }
    }
    
    public void cal(){
        high=t[1];
        low=t[1];
        for(i=0;i<6;i++){
            if(t[i]>high){
                high=t[i];
                hd=i+1;
            }
            if(t[i]<low){
                low=t[i];
                ld=i+1;
            }
        }
    }
    
    public void display (){
        System.out.println("city name :"+name);
        System.out.println("highest temperature"+high +"on Jan-"+hd);
         System.out.println("lowest temperature"+low +"on Jan-"+ld);
        
        
    }
    
    
    
    
    
    
} 
