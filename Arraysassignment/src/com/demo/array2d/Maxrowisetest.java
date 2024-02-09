package com.demo.array2d;

public class Maxrowisetest {
//	3.	WAP to print maximum in rowwise in 2D array. Means e.g. arr[][] ={{22, 31, 9}, {12, 25, 16}} output is: 31 and 25.
	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 1 }, { 2, 3, 2 }, { 3, 4, 5 }, { 7, 8, 9 } };
		

		for (int i = 0; i < arr.length; i++) {
			int max = arr[i][0];

			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];

				}

			}
			System.out.println("In" + (i + 1) + "st row maximum number is" + ":" + max);

		}
	}

}
