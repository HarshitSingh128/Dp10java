package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Nested_even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num ,rem;
		System.out.println("Enter number=");
		num=sc.nextInt();
		rem=num%2;
		if (rem==0) {
			System.out.println("even=");
		
		if(num%6==0) {
			System.out.println("number is divisible by  6=");
		}
		else 
		{ System.out.println("number is not divisible by 6=");
		}
		}
		else
		{ 
			System.out.println("odd='");
		
		if  (num%5==0) {
			System.out.println("number is divisible by 5=");
		}
		else {
			System.out.println("number is not divisible by 5=");
		}
		}
			
		
	}

}
