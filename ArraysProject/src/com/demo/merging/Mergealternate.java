package com.demo.merging;

import java.util.Arrays;

public class Mergealternate {
	public static int[] mergealternatetest(int a1[],int a2[]) {
		int len1=a1.length;
		int len2=a2.length;
		int mer[]=new int[len1+len2];
		int i,j,index;
		index=0;
		for(i=0,j=0;i<len1&&j<len2;i++,j++) {
			mer[index++]=a1[i];
			mer[index++]=a2[i];
			
		}
		while(i<len1) {
			mer[index++]=a1[i++];
		}
		while(j<len2) {
			mer[index++]=a2[j++];
		}
		return mer;
				
	}
	public static void main(String[] args) {
		int	arr1[]= {2,3,4,5};
		int arr2[]= {2,7,8,9,5,7,8,7};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		int mer[]=mergealternatetest(arr1, arr2);
		System.out.println("After merging alternaitily");
		System.out.println(Arrays.toString(mer));

	}

}
