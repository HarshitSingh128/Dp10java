package com.demo.basic;

import java.util.Arrays;

public class EvenOddTestArray {
	public static void evenTest1(int ar[]) {
		int odd[] = new int[4];
		int even[] = new int[4];

		int j = 0, k = 0;
		System.out.println("Even elments are:");
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] % 2 == 0) {
				even[j++] = ar[i];

			} else 
			{
				odd[k++] = ar[i];

			}
		}
		System.out.println("Even array:" + Arrays.toString(even));
		System.out.println("Odd Array:" + Arrays.toString(odd));

	}

	public static void main(String[] args) {
		int arr[] = { 78, 85, 56, 45, 85, 77, 88, 66 };

		evenTest1(arr);

	}

}
