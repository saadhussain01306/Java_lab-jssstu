import java.util.*;

class StackException extends Exception{
    StackException(String str){
        super(str);
    }
}

class stack{
    private final int[] stk;
    private int tos;
    
    stack(int size){
        stk=new int[size];
        tos=-1;
    }
    
    void push(int item) throws StackException{
        if(tos==stk.length-1){
            throw new StackException("Stack overflow!");
        }
        else{
            stk[++tos]=item;
        }    
    }
    
    int pop() throws StackException{
        if(tos<0){
            throw new StackException("Stackj Underflow\n");
        }
        
        else{
            return stk[tos--];
        }
    }
    
    void display(){
        if(tos<0){
            System.out.println("Stack undeflow\n");
            
        }
        
        else{
            int i;
            for(i=tos;i>-1;i--){
                System.out.print(stk[i]+" ");
            }
        }
    }
    
    void peek(){
        if(tos<0){
            System.out.println("stack underflow");
        }
        else{
            System.out.println("Peek element is :"+(stk[tos]));
        }
    }
    
    
}
public class Main{
    public static void main(String x[]){
        Scanner in =new Scanner (System.in);
        System.out.println("Enter the size of the queue\n");
        int size=in.nextInt();
        stack ob=new stack(size);
        int ch;
        
        do{
            System.out.println("1.push\n2.pop\n3.display\n4.peek\n5.exit");
            System.out.println("Enter your choice");
            ch=in.nextInt();
            switch(ch){
                case 1:try{
                    System.out.println("Enter the element to be inserted");
                    ob.push(in.nextInt());
                }catch(StackException e){
                    System.err.println("Exception caught:"+e);
                    }
                     break;
                    
                case 2:
                    try{
                        System.out.println("The poped element is :"+ob.pop());
                    }catch(StackException e){
                        System.out.println("Exception caught:"+e);
                    }
                     break;
                    
                case 3:ob.display();
                      break;
                      
                case 4:ob.peek();
                       break;
                case 5:break;
                
                default:System.out.println("Enter a valid choice");
                break;
            }
        }while(ch!=5);
    }
}
