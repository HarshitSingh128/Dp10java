package Com.demo.patterns;

import java.util.Scanner;

public class pattern2 {
	public static void pattern(int rows) {
		int i,j;
		for(i=rows;i>=1;i--) {
			for(j=1;j<=i;j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows:");
		int rows=sc.nextInt();
		pattern(rows);
	
	}

}
