package com.demo.array2d;

public class Minrowtest {
	
//	4.	WAP to print minimum in columns. Means e.g. arr[][]={{22, 31, 9}, {12, 5, 		16}, {34, 42, 2}} output is: 12, 5, 2.
	public static void main(String[] args) {
		int arr[][] = { { 2, 1, 7 }, { 3, 7, 3 },{ 5, 4, 9 } };

		for (int i = 0; i < arr.length; i++) {
			int min = arr[0][i];

			for (int j = 0; j < arr[i].length; j++) {
				if (arr[j][i] < min) {
					min = arr[j][i];

				}

			}
			System.out.println("In" + (i + 1) + "st coloum  number is" + ":" + min);

		}

	}

}
