package com.demo.basic;

import java.util.Arrays;

public class SumtwoArrays {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3 ,5,7,8,7};
		int[] arr = { 2, 3, 5 ,4,7,7,9};
		int[] sumArray = new int[ar.length];
		for (int i = 0; i < ar.length; i++) {
			sumArray[i] = ar[i] + arr[i];
		}
		System.out.println("Sum is:");
		System.out.println(Arrays.toString(sumArray));

	}

}
