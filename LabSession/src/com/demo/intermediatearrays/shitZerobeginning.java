package com.demo.intermediatearrays;

import java.util.Arrays;
//6> Shift zeros at the beginning of array
public class shitZerobeginning {
	static void shiftzero(int ar[]) {
		int count=ar.length-1;
		for(int i=count;i>=0;i--) {
			if(ar[i]!=0) {
				ar[count]=ar[i];
				count--;
			}
		}
		while(count >=0) {
			ar[count--]=0;
		}
	}

	public static void main(String[] args) {
		int arr[]= {5,0,6,-7,0,4,0,5,6,2};
		System.out.println(Arrays.toString(arr));
		shiftzero(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
