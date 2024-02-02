package Com.demo.patterns;

import java.util.Scanner;

public class demo1 {
	public static void printpattern(int rows) {
		int i,j;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("*  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows:");
		int rows=sc.nextInt();
		printpattern(rows);

	}

}
