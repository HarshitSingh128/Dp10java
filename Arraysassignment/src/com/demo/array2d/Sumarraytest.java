package com.demo.array2d;
//9.	WAP to find sum of each row and column of a matrix.
public class Sumarraytest {
	public static void sumrow(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;

			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];

			}
			System.out.println("Row sum is :" + sum);

		}
	}
	public static void sumcoloum(int arr[][]) {
		
			for (int i = 0; i < arr.length; i++) {
				int sum = 0;

				for (int j = 0; j < arr[i].length; j++) {
					sum = sum + arr[j][i];

				}
				System.out.println("Coloum sum is :" + sum);

			}
		}
		
	

	public static void main(String[] args) {
		int ar[][] = { { 4, 1}, { 2, 2 } };
		sumrow(ar);
		sumcoloum(ar);

	}

}
