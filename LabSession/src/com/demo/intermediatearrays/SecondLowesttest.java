package com.demo.intermediatearrays;

import java.util.Arrays;
//Find the second minimum number in an array without sorting

public class SecondLowesttest {
	public static int secondLowest(int a[]) {
		int lowest=Integer.MAX_VALUE;//a[0];
		
		int slowest=Integer.MAX_VALUE;//a[0]
		for(int i=0;i<a.length;i++)
			{
				if(a[i]<lowest)
				{
					slowest=lowest;
					lowest=a[i];
				}
				else if(a[i]<slowest)
				{
					slowest=a[i];
				}
			}
		return slowest;
		
		
	}

	public static void main(String[] args) {
		int arr[]= {2,5,1,4};
		System.out.println(Arrays.toString(arr));
		int lh=secondLowest(arr);
		System.out.println("Second Lowest:"+lh);
	

	}

}
