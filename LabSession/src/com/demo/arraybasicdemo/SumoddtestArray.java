package com.demo.arraybasicdemo;

public class SumoddtestArray {
	static void sumOdd(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2!=0) {
				sum=sum+a[i];
			}
			
		}
		System.out.println("Sum is :"+sum);
	}

	public static void main(String[] args) {
		int arr[]= {2,3,5,7,8};
		sumOdd(arr);
	
	}

}
