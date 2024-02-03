package com.demo.intermediatearrays;

import java.util.Arrays;

public class ShistEvennubTemporary {
	//2>>Shift all the even number at the end of array using temporary array 
	public static void eventemporary(int a[]) {
		int temp[]=new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0)
			temp[index]=a[i];
			index++;
		}
		//System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		int arr[]= {2,4,8,3,5,6};
		System.out.println(Arrays.toString(arr));
		eventemporary(arr);
		
		
	}

}
