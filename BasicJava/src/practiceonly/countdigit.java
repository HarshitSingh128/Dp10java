package practiceonly;

import java.util.Scanner;

public class countdigit {
	public static void ps(int num) {
		int rem;
		int count=0;
		
		while(num>0) {
			rem=num%10;
			num/=10;
			count++;
			System.out.println(rem);
			
		}
		System.out.println("Count:"+count);
		
	}
	public static void product(int num) {
		int rem;
		int sum=1;
		while(num>0) {
			rem=num%10;
			 sum=sum*rem;
			 num/=10;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter nub");
		int num=sc.nextInt();
		ps(num);
		product(num);
		

	}

}
