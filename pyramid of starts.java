import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r,c;
		System.out.print("enter the number of starts at the base");
		int n=in.nextInt();
		for(r=1;r<=n;r++){
		    for(c=n-r;c>0;c--){
		        System.out.print(" ");
		    }
		    for(c=1;c<=r;c++){
		        System.out.print("* ");
		    }
		    System.out.println();
		}
	}
}

