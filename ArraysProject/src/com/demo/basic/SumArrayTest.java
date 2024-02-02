package com.demo.basic;

public class SumArrayTest {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 5, 4, 7 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
         sum = sum + arr[i];

		}
		System.out.println("Sum:"+sum);

	}
}