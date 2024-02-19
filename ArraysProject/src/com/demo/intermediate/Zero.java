package com.demo.intermediate;

import java.util.Arrays;

public class Zero {
	public static void zerotest(int ar[]) {
		for(int i=0;i<ar.length;i++)
		{
			for(int j=ar.length-1;j>=0;j--)
			{
				if(ar[i]<0 &&i<j)
				{
					int temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
	}
	static void rotate(int a[]) {
		int temp=a[a.length-1];
		for(int i=a.length-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;
		System.out.println(Arrays.toString(a));
	}
		
	

	public static void main(String[] args) {
		int ar[]= {2,3,5,7,9,0,-4,-2,4,2,8,2};
		//zerotest(ar);
		int arr[]= {1,2,3,4,5};
		//System.out.println(Arrays.toString(ar));
		rotate(arr);
		
		

	}

}
