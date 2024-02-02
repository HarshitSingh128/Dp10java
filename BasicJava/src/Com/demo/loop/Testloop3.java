package Com.demo.loop;

import java.util.Scanner;

public class Testloop3 {
	public static void printLoop(int start ,int end) {
		int i;
		int count=0;
		for(i=start;i<=end;i++) {
			System.out.println(i);
			count++;
		}
		System.out.println("count="+count);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start,end;
		System.out.println("Enter Start=");
		start=sc.nextInt();
		System.out.println("Enter End=");
		end=sc.nextInt();
		printLoop(start,end);
		

	}

}
