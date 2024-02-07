package com.demo.merging;

import java.util.Arrays;

public class mergeDemo {
	static int[] mergeall(int a1[],int a2[]) {
		int len1=a1.length;
		int len2=a2.length;
		int mer[]=new int[len1+len2];
		int index=0;// for the mer
		for(int i=0;i<a1.length;i++) {
			mer[index++]=a1[i];
		}
		for(int i=0;i<a2.length;i++) {
			mer[index++]=a2[i];
			
		}
		return mer;
	}

	public static void main(String[] args) {
	int	arr1[]= {2,3,4,5};
	int arr2[]= {2,7,8,9,5,7,8,7};
	System.out.println(Arrays.toString(arr1));
	System.out.println(Arrays.toString(arr2));
	int mer[]=mergeall(arr1, arr2);
	System.out.println(Arrays.toString(mer));
	
	
		
		
	}

}
