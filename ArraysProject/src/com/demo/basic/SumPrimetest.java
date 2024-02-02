package com.demo.basic;

import java.util.Arrays;

public class SumPrimetest {
	public static void primeTest(int a[]) {

		boolean flag = true;
		int sum = 0;

		System.out.println(Arrays.toString(a));
		System.out.println("Prime element is:");
		for (int i = 0; i < a.length; i++) {
			flag = true;
			if (a[i] > 1) {
				for (int j = 2; j < a[i]; j++) {
					if (a[i] % j == 0) {
						flag = false;
						break;

					}
				}
				if (flag == true) {
					sum = sum + a[i];
					System.out.println(a[i]);

				}

			}
		}
		System.out.println("Sum is:" + sum);

	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 8, 5, 7 };
		primeTest(ar);

	}

}
