package com.demo.array2D;

public class SummultiarrayTest {

	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 1 }, { 2, 2, 2 } };

		
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum = sum + arr[i][j];

			}
			System.out.println(sum);
		}


	}

}
