package Com.demo.patterns;

import java.util.Scanner;

public class assign3_A {
	public static void pattern1() {
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
            pattern1();

	}

}
