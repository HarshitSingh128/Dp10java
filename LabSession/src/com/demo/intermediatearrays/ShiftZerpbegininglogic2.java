package com.demo.intermediatearrays;

import java.util.Arrays;

public class ShiftZerpbegininglogic2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,0,5,0,10};
	    int temp[]=new int[arr.length];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			 if(arr[i]==0)
			 {
				 temp[j]=arr[i];
				 j++;
				 
			 }
			 
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr[i]"+arr[i]);
			System.out.println("j"+j);
			 if(arr[i]!=0)
			 {
				 temp[j]=arr[i];
				 j++;
				 
			 }
			 
		}
		System.out.println(Arrays.toString(temp));
		

	}

}
