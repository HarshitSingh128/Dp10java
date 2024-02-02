package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Extraassign1 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n1,n2;
			System.out.println("Enter value of n1=");
			n1=sc.nextInt();
			System.out.println("Enter value of n2=");
	        n2=sc.nextInt();
	        if(n1>n2) {
	        	System.out.println(" n1 is maximum=");
	        }
	        else 
	        {
	        	System.out.println(" n2 is minimum=");
	        }

	}

}
