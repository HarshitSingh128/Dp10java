package com.demo.intermediate;

import java.util.Arrays;

public class Halfreverse {
	public static void reversetest(int a[]) {
		int arr1[]=new int [8];
		int index=0;
	
		for( int i=1;i<a.length/2;i++) {
			for(int j=i+1;j<a.length/2;j++) {
				if(a[j]<a[i]) {
					int temp=a[i];
					a[i]=a[j];
				    a[j]=temp;
				}
			
				
			}
		
			
		}
		for( int i=(a.length/2)+1;i<a.length-1;i++) {
			for(int j=i+1;j<a.length-1;j++) {
				if(a[j]>a[i]) {
					int temp=a[j];
					a[j]=a[i];
				    a[i]=temp;
				}
			
				
			}
		
			
		}
		System.out.println(Arrays.toString(a));
		
		
	}

	public static void main(String[] args) {
		int arr1[]= {7,5,3,2,8,2,4,5,6};
		reversetest(arr1);
		

	}

}
