package Com.demo.patterns;

import java.util.Scanner;

public class pattern1 {
	public static void pattern1(int rows) {
		int i,j,k;
		for(i=1;i<=rows;i++) {
			for(k=rows;k>=i;k--) {
				System.out.print(" ");
			}
				for(j=1;j<=i;j++) {
					System.out.print("* ");
					
				}
				System.out.println();
			}
		}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows:");
		int rows=sc.nextInt();
		pattern1(rows);

	}

}
