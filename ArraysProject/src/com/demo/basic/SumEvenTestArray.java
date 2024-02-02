package com.demo.basic;

import java.util.Arrays;

public class SumEvenTestArray {
	static void sumEven(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sum=sum+a[i];
			}
		}
		System.out.println("Inside Method");
		System.out.println(Arrays.toString(a));
		System.out.println(sum);
		
		
	}

	public static void main(String[] args) {
		int ar[]= {1,2,4,5,6};
		int a[]= {2,4,56,5};
		sumEven(ar);
		sumEven(a);

	}

}
