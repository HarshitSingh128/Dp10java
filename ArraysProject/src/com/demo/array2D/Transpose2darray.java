package com.demo.array2D;

import java.util.Scanner;

public class Transpose2darray {
	static int[][] findTranspose(int ar[][],int rows,int cols ){
		int tr[][]=new int[cols][rows];
		
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				tr[j][i]=ar[i][j];
			}
		}
		return tr;
	}
	static void displayMultiarray(int ar[][]) {
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar.length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows:");
		int rows=sc.nextInt();
		
		System.out.println("Enter colums in each row:");
		int cols=sc.nextInt();
		
		int arr[][]=new int[rows][cols];
		//input the value
		System.out.println("_____________");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter values of row"+(i+1)+" ");
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("=================");
		displayMultiarray(arr);
		
		int tarr[][]=findTranspose(arr,rows,cols);
		System.out.println("---------------------------");
		displayMultiarray(tarr);
		
		
		
		
		
		
	

	}

}
