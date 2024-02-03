package com.demo.intermediatearrays;
//3>>Shift all the even number at the end of array w/o using temporary array

import java.util.Arrays;

public class ShiftEven {
	public static void shiftevenTest(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			for(int j=ar.length-1;j>=0;j--) {
				if(ar[i]%2==0&& i<j) {
					int temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
				
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {2,3,1,5,6,8,7,9};
		System.out.println(Arrays.toString(arr));
		shiftevenTest(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
