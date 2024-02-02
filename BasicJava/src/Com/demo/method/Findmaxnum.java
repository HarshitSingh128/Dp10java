package Com.demo.method;

import java.util.Scanner;

public class Findmaxnum {
	public static int findmax(int n1, int n2) {
		if(n1>n2)
			return n1;
		else 
			return n2;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		System.out.println("Enter n1=");
		num1=sc.nextInt();
		System.out.println("Enter n2=");
		num2=sc.nextInt();
		int max=findmax(num1,num2);
		System.out.println("max number is ="+max);
		

		

	}

}
