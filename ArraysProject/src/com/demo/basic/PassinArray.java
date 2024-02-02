package com.demo.basic;

import java.util.Arrays;

public class PassinArray {
	static void squareElements(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			ar[i]=ar[i]*ar[i];
		}
		System.out.println("Inside Method");
		System.out.println(Arrays.toString(ar));
	}
	int sumofElements(int ar[]) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum+=ar[i];
		}
		return sum;
		
	}

	public static void main(String[] args) {
		int arr[]= {5,4,5,7,2};
		int a[]= {4,5,7,8};
		squareElements(arr);
		System.out.println("========");
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(a));
		squareElements(a);
		System.out.println("========");
	
		
	

	}

}
