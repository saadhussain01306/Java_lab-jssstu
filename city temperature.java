import java.util.*;
class City{
    Scanner in = new Scanner(System.in);
    int []t=new int[6];
    int high,low,hd,ld;
    String name;
    public void read(){
        System.out.print("enter the name of the city:");
        name=in.next();
        for(int i=0;i<6;i++){
            System.out.print("Enter the temperature on Jan-"+(i+1)+" :");
            t[i]=in.nextInt();
        }
        System.out.println();
    }
    public void cal(){
        high=t[1];
        low=t[1];
        for(int i=0;i<6;i++){
            if(t[i]>high){
                high=t[i];
                hd=(i+1);
                if(t[i]<low){
                    low=t[i];
                   ld=t[i];
                }
            }
        }
    }
    public void display(){
        System.out.print("City Name :"+name);
        System.out.print("Highest temperature is "+high+" on Jan-"+hd);
        System.out.print("Lowest temperature is "+low+" on Jan-"+ld);
    }
}

public class Main{
    public static void main(String x[]){
        City city[]=new City[5];
        Scanner in = new Scanner(System.in);
        int i;
        for(i=0;i<5;i++){
            city[i]=new City();
        }
        for(i=0;i<5;i++){
            System.out.println("Enter the details of city-"+(i+1)+":");
            city[i].read();
            city[i].cal();
        }
        int ch=0;
        int ctn=0;
        while(ch!=2){
        System.out.println("Enter \n1 to displaY the Highest and lowest temperature\n 2.Exit ");
        System.out.println("enter Your choice ");
        ch=in.nextInt();
        if(ch==1){
            System.out.println("Enter the city number :");
            ctn=in.nextInt();
            if(ctn<1 || ctn>5){
                System.out.println("enter a valid city number");
            }
            else{
                city[ctn-1].display();
            }
        }
        else if(ctn==2){
            break;
        }
        else{
            System.out.println("Enter a valid choice");
        }
        }
    }
}
