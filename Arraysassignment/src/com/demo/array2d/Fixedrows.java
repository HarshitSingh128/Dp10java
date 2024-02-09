package com.demo.array2d;
//2.	WAP to accept data in 2D array where rows are fixed and columns are variable.
public class Fixedrows {
	static void displayMultiarray(int ar[][]) {
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<ar[i].length;j++) {
				System.out.print(ar[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int jarr[][]= {{1},{2,2},{3,3,3}};
		displayMultiarray(jarr);
		

	}

}
