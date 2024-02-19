package com.demo.intermediate;

import java.util.Arrays;

public class SumTest {
	public static void sumcheck(int a[]) {
		int sum = 8;
		for (int i = 0; i < a.length ; i++) {
			for (int j = 0; j < a.length; j++) {
				if ( sum==a[i] + a[j]) {
					System.out.println(a[i] + " " + a[j]);

				}
			}

		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 5, 4, 6, 0, 8 };
		System.out.println(Arrays.toString(arr));
		sumcheck(arr);

	}
}
