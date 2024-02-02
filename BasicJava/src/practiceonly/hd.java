package practiceonly;

import java.util.Scanner;

public class hd {
	public static void dhf(int num) {
		int rem;
		int sum=0;
		int temp=num;
		
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num/=10;
			
		}
		if(temp%sum==0) {
			System.out.println("hn");
		}
		else 
			System.out.println("nhn");
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter num=");
		int num=sc.nextInt();
		// TODO Auto-generated method stub
		dhf(num);

	}

}
