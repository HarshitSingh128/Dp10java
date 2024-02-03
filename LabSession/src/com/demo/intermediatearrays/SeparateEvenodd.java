package com.demo.intermediatearrays;

import java.util.Arrays;

public class SeparateEvenodd {
	public static void separate(int ar[]) {
		for(int i=0;i<ar.length;i++)
		{
			for(int j=ar.length-1;j>=0;j--)
			{
				if(ar[i]%2!=0 &&i<j)
				{
					int temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(ar));
	}

	public static void main(String[] args) {
		int arr[]= {2,4,5,7,8,9};
		separate(arr);
	
	}

}
