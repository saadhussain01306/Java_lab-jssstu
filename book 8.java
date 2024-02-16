import java.util.*;

class Book{
    int quatity,i,id;
    float unitprice,total;
    String name;
    Scanner in = new Scanner(System.in);
    Book B[]=new Book[10];
    void read(){
    for(i=0;i<10;i++){
        B[i]=new Book();
        System.out.println("ENter the details of BOOK-"+(i+1));
        System.out.println("Enter the name of BOOK:");
        B[i].name=in.next;
        System.out.println("Enter the BOOK-ID:")
        B[i].id=in.nextInt();
        System.out.println("Enter the cost per unit:");
        B[i].unitprice=in.nextFloat();
        System.out.println("Enter the book quantity:");
        B[i].quantity=in.nextInt();
    }
    }
    void total(){
        total=unitprice*quantity;
    }
    void display(){
        for(i=0;i<10;i++){
        System.out.println("")
        }
    }
    
}
