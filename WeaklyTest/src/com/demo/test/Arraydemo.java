package com.demo.test;

import java.util.Arrays;

public class Arraydemo {
	static void arraytest(int arr [] ) { 
		if(arr.length%2==0) {
			int temp=arr[0];
			for(int i=1;i<arr.length;i++) {
				arr[i-1]=arr[i];
				
			}
			arr[arr.length-1]=temp;
			
		}
		else {
			
		}
		
	}

	public static void main(String[] args) {
		int ar[]= {1,2,5,7,3,4};
		for(int i=0;i<3;i++){
		arraytest(ar);
		}
		System.out.println(Arrays.toString(ar));

	}

}
