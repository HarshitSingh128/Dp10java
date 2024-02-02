package com.demo.basic;

import java.util.Arrays;

public class AverageTest {
	
	
	public static void averagearraystest(int a[]) {
		int sum=0;
		double average;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		average=sum/a.length;
		System.out.println(Arrays.toString(a));
		System.out.println("Average is :"+average);
		
		
	}
	public static void main(String[] args) {
		int arr[]= {2,5,7,8,8};
		averagearraystest(arr);
		
	}

}
