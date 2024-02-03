package com.demo.intermediatearrays;

import java.util.Arrays;
//Find the max and minimum number from an array and swap their positions
//eg:{1,2,3,4,5,6}
//o/p:{6,2,3,4,5,1}

public class Maxminswap {
	public static void maxminTest(int a[]) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int indexMin = 0, indexMax = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				indexMax = i;

			}
			if (a[i] < min) {
				min = a[i];
				indexMin = i;
			}
		}

		int temp = a[indexMin];
		a[indexMin] = a[indexMax];
		a[indexMax] = temp;

		System.out.println(Arrays.toString(a));

	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5, 6 };
		
		 System.out.println(Arrays.toString(ar));
		maxminTest(ar);

	}

}
