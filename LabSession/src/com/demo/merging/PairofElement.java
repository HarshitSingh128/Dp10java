package com.demo.merging;
//Task
//1>> Find the pair of elements whose sum is equivalent to the given sum
public class PairofElement {
	public static void pairtest(int a[]) {
		int sum = 8;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if ( sum==a[i] + a[j]) {
					System.out.println(a[i] + " " + a[j]);

				}
			}

		}
	}

	

	public static void main(String[] args) {
		int ar[]= {2,6,4,4};
		pairtest(ar);
		

	}

}
