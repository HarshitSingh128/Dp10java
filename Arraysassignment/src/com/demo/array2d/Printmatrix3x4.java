package com.demo.array2d;
//1.	wAP to accept data in 2D array of 3X4 and accept data.
public class Printmatrix3x4 {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3,4},{4,5,6,7},{7,8,9,1}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
