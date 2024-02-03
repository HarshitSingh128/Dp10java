package com.demo.intermediatearrays;

import java.util.Arrays;
//2>> Find the sum of prime numbers in array using enhanced for loop

public class PrimesumEnhancedTest {
	public static void sumEnhanced(int a[]) {
		boolean flag = true;
		int sum = 0;
		System.out.println(Arrays.toString(a));
		System.out.println("Prime elements is:");
		for (int x : a) {
			flag = true;
			if (x > 1) {
				for (int j = 2; j < x; j++) {
					if (x % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag == true) {
					sum = sum + x;
					System.out.println(x);
				}

			}
		}
		System.out.println("Sum is: " + sum);

	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 3, 7, 8 };
		sumEnhanced(arr);

	}

}
