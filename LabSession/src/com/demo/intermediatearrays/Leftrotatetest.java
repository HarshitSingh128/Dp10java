package com.demo.intermediatearrays;

import java.util.Arrays;
//4>> WAP to left rotate the array
//ar={1,2,3,4,5}
//o/p: {3,4,5,1,2}
public class Leftrotatetest {
	public static void lefttest(int a[]) {
		System.out.println(Arrays.toString(a));

		int temp = a[0];
		for (int i = 1; i < a.length; i++) {
			a[i - 1] = a[i];

		}
		a[a.length - 1] = temp;

	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < 2; i++) {

			lefttest(ar);

		}

		System.out.println(Arrays.toString(ar));

	}

}
