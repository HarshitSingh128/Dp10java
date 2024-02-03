package com.demo.intermediatearrays;

import java.util.Arrays;
//1>> WAP to half sort the array in ascending and half in descending
public class AsendinganddesendingTest {
	static void asendingTest(int a[]) {
	for(int i=0;i<a.length/2;i++) {
		for(int j=i+1;j<a.length/2;j++) {
			if(a[j]<a[i]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=a.length/2;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[j]>a[i]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int arr[]= {2,4,3,8,4,0,2,8};
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		asendingTest(arr);
			
		}
		

	}


