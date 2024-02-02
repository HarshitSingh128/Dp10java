package practiceonly;

import java.util.Scanner;

public class factors {
	public static void fac(int num) {
		int i;
		int count=0;
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
				count++;
			}
			
			
		}
		System.out.println("Count:"+count);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter num=");
		int num=sc.nextInt();
		fac(num);
		

	}

}
