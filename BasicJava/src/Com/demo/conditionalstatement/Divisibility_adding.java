package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Divisibility_adding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,add;
		System.out.println("Enter number=");
		num=sc.nextInt();
		if(num%7==0) {
			System.out.println("divisible=");
		} 
		else {
			System.out.println("Enter num if u want to add=");
			add=sc.nextInt();
			num=num+add;
			if(num%7==0) {
				System.out.println("divisible=");
			}
		}
		

	}
	}

		
