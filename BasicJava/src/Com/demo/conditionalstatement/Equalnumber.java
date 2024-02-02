package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Equalnumber {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n1,n2,n3;
			System.out.println("Enter value of n1=");
			n1=sc.nextInt();
			System.out.println("Enter value of n2=");
	        n2=sc.nextInt();
	        System.out.println("Enter value of n3=");
	        n3=sc.nextInt();
	        if(n1==n2  && n2==n3 && n3==n1) {
	        	System.out.println("n1 ,n2 and n3 are equal=");
	        }
	        else {
	        	System.out.println("n1 ,n2 and n3 are not equal=");
	        }

	}

}
