package practiceonly;

import java.util.Scanner;

public class palindrome {
	public static void palind(int num) {
		int rem;
		int sum=0;
		int temp=num;
		while(num>0) {
			rem=num%10;
			sum=(sum*10)+rem;
			num/=10;
			
		}
		if(temp==sum) {
			System.out.println("Palindrome number:");
			
		}
		else 
			System.out.println("Not palindrome ");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter num=");
		int num=sc.nextInt();
		palind(num);

	}

}
