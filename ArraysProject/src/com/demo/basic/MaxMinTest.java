package com.demo.basic;

import java.util.Arrays;

public class MaxMinTest {
	public static void MaxTest(int a[]) {
		int max = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];

			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("maximum nub:" + max);

	}

	public static void MinTest(int a[]) {
		int min = a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Minimum nub:"+min);

	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 5, 4 };
		MaxTest(ar);
		MinTest(ar);

	}

}
