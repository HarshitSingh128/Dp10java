package Com.demo.patterns;

import java.util.Scanner;

public class pattern5 {
	public static void pattern1(int n) {
		int i, j, k;
		for (i = 1; i <= n; i++) {
			for (k = 1; k <= i; k++) {
				System.out.print(" ");
			}
			for (j = n; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows:");
		int n = sc.nextInt();
		pattern1(n);

	}

}
