package practiceonly;

import java.util.Scanner;

public class ExtraSeries {
	public static void series(int num) {
		int i=7;
		System.out.println(i);
		while(i<99)
		{
			i=i+3;
			System.out.println(i+"");
			i=i-2;
			System.out.println(i+"");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		series(num);
		

	}

}
