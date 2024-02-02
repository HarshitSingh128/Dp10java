package Com.demo.conditionalstatement;
import java.util.*;

public class Assignment1_6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x;
		System.out.println(" Enter the number");
		x=sc.nextInt();
		if (x<0) {
			System.out.println("x is negative");
		}
		else if(x==0)
		{
			System.out.println("x is neither even nor odd");
		}
		else 
		{System.out.println("x is positive");
		}
		

	}

}
