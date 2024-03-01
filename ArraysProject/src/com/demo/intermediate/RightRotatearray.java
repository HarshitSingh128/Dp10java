package com.demo.intermediate;

import java.util.Arrays;

public class RightRotatearray {
	public static void rotateonce(int ar[]) {
		int len=ar.length;
		int temp=ar[len-1];
		//shifting 
		for(int i=len-1;i>0;i--) {
			ar[i]=ar[i-1];
		}
		ar[0]=temp	;
		
	}
	public static void leftrotate(int ar[] ) {
		int temp=ar[0];
		for(int i=1;i<ar.length;i++) {
			ar[i-1]=ar[i];
		}
		ar[ar.length-1]=temp;
		
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
	//System.out.println(Arrays.toString(arr));
		System.out.println("=========================");
		for(int i=0;i<3;i++) {
			//rotateonce(arr);
			/////System.out.println(Arrays.toString(arr));
		}
		System.out.println("=========================");
		//System.out.println(Arrays.toString(arr));
		
		System.out.println("=================================");
		System.out.println(Arrays.toString(arr));
		System.out.println("=========================");
		for(int i=0;i<2;i++) {
			leftrotate(arr);
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("=========================");
		System.out.println(Arrays.toString(arr));
		
		
	
	
		
	}
}


