      package com.demo.intermediate;

import java.util.Arrays;

public class SortingArray {
	public static void sortArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 2, 3, 0, 1, 7, 8, 5 };
		System.out.println("Before Sorting:");
		System.out.println(Arrays.toString(arr));
		sortArray(arr);
		System.out.println("After Sorting:");
		System.out.println(Arrays.toString(arr));

	}

}
