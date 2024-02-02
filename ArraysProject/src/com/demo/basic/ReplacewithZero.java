package com.demo.basic;

import java.util.Arrays;

public class ReplacewithZero {
	static void replace(int a[]) {
		System.out.println(Arrays.toString(a));
		

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				a[i] = 0;

			}
		}
		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {
		int arr[] = { 2, -8, 0, -7, -9, 4, 2 };
		replace(arr);

	}

}
