package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Assignment2_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		char y;
		System.out.println("Enter first number=");
		a=sc.nextInt();
		System.out.println("Enter second number=");
		b=sc.nextInt();
		System.out.println("Enter an operator=");
		y=sc.next().charAt(0);
		if(y=='+')
		{
			c=a+b;
		System.out.println("a+b="+c);
		}
		else if (y=='-')
		{
			c=a-b;
		
			System.out.println("a-b="+c);
		}
		else if (y=='*')
		{
			c=a*b;
		
			System.out.println("a*b="+c);
		}
		else if (y=='/')
		{
			c=a/b;
		
		System.out.println("a/b="+c);
				
		}
	}
}
		
		
		
	


