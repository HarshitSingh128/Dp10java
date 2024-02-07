package com.demo.merging;

import java.util.Arrays;

//2>> Merge the two arrays as follows
//ar1={1,2,3}
// ar2={4,5,6,7,8}
//o/p: mar1={1,4,2,5,3,6,7,8}
// mar2={1,5,3,7,8}
public class Merging {
	public static int [] mergingtest(int a1[],int a2[]) {
		int len1=a1.length;
		int len2=a2.length;
		int mar1[]=new int[len1+len2];
		int index=0;
		for(int i=0;i<a1.length;i++) {
			mar1[index++]=a1[i];
			
		}
		for(int i=0;i<a2.length;i++) {
			mar1[index++]=a2[i];
			
		}
		return mar1;
	}
	public static int[] mergealternate(int a1[],int a2[]) {
		int len1=a1.length;
		int len2=a2.length;
		int mar1[]=new int[len1+len2];
		int index=0;
		int i,j;
		for(i=0,j=0;i<a1.length&&j<a2.length;i++,j++ ) {
			mar1[index++]=a1[i];
			mar1[index++]=a2[i];
		}
		while(i<a1.length) {
			mar1[index++]=a1[i++];
		}
		while(j<a2.length) {
			mar1[index++]=a2[j++];
		}
		return mar1;
		
		
	}
public static int[] mergealternatilyskip(int a1[],int a2[]) {
	int len1=a1.length;
	int len2=a2.length;
	int maxlength=Math.max(len1, len2);
	int mar1[]=new int[maxlength];
	int index=0;
	int i=0;
	while(index<maxlength) {
		if(i<a1.length) {
			mar1[index++]=a1[i++];
			
		}
		if(i<a2.length) {
			mar1[index++]=a2[i++];
			
		}
	}
	return mar1;
	
}
	public static void main(String[] args) {
		int arr1[]= {1,2,3};
		int arr2[]= {4,5,6,7,8};
	int mar1[]=mergingtest(arr1,arr2);
	System.out.println(Arrays.toString(mar1));
	System.out.println("++++++++++++++++++++");
	int mar2[]=mergealternate(arr1,arr2);
	System.out.println(Arrays.toString(mar2));
	System.out.println("+++++++++++++++++++++++++++++++++");
		int mar3[]=mergealternatilyskip(arr1,arr2);
		System.out.println(Arrays.toString(mar3));

	}

}
