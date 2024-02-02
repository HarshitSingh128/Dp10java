package practiceonly;

import java.util.Scanner;

public class practice1 {
	public static void practice(int start,int end ) {
		int i;
		int count=0;
		for (i=start;i<=end;i++) {
			System.out.println(i);count++;
			
		}
		System.out.println("count:"+count);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter start=");
		int stasrt=sc.nextInt();
		System.out.println("Enter end =");
		int end =sc.nextInt();
		int start = 0;
		practice(start,end);
		

	}

}
