package com.demo.arraysInfo;

import java.util.Arrays;

public class Reverse3 {
	public static void reversetest(int a[]) {
		System.out.println(Arrays.toString(a));
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
		
		
	}

	public static void main(String[] args) {
		int ar[]= {3,90,45,29,37,78};
		reversetest(ar);
		

	}

}
