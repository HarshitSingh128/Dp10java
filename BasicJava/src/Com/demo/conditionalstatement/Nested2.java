package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Nested2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;
		System.out.println("Enter number=");
		num=sc.nextInt();
		if(num%5==0) {
			if(num%11==0) {
				System.out.println(num+" is diviible by 5 and 11");
			}
			else {
				System.out.println(num+" is only divisible by 5");
			}
		}
		else if(num%11==0) {
			
				System.out.println(num+" is divisible by 11 only");
			
		}
		else {
			System.out.println("not by both");
		}
	}

	}


