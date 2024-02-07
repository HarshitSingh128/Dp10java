package com.demo.intermediate;

import java.util.Arrays;

public class Zero {
	public static void zerotest(int ar[]) {
		for(int i=0;i<ar.length;i++)
		{
			for(int j=ar.length-1;j>=0;j--)
			{
				if(ar[i]%2==0 &&i<j)
				{
					int temp=ar[j];
					ar[j]=ar[i];
					ar[i]=temp;
				}
			}
		}
	}
		
	

	public static void main(String[] args) {
		int ar[]= {2,3,5,7,9,4,2,8,2};
		zerotest(ar);
		System.out.println(Arrays.toString(ar));
		
		

	}

}
