package practiceonly;

import java.util.Scanner;

public class disari {
	public static void disari(int num){
		int rem;
		int sum=0;
		int count=0;
		while(num>0) {
			rem=num%10;
			num/=10;
			count++;
			
		}
		while(num>0) {
			int rem1;
			//int temp1=num;
			rem1=num%10;
			sum=(int) (sum+Math.pow(rem1, count));
			num/=10;
			count--;
			
			
		}
		int temp1=num;
		if(sum==temp1) {
			System.out.println("dn");
			
		}
		else 
			System.out.println("dsn");
		
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter num=");
		int num=sc.nextInt();
		disari(num);
		
	}

}
