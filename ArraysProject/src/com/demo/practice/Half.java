package com.demo.practice;

import java.util.Arrays;

public class Half {
	public static void sort(int a[]) {
		for(int i=0;i<a.length/2;i++) {
			for(int j=i+1;j<a.length/2;j++) {
				if(a[j]<a[i]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		for(int i=(a.length/2);i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[i]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;	
					
				}
			}
		}
		System.out.println(Arrays.toString(a));
		
	}
	public static int[] merge(int a[],int ar[]) {
		int len1=a.length;
		int len2=ar.length;
		int mer[]=new int[len1+len2]; 
		int index=0;
		int i,j;
		for(i=0,j=0;i<len1&&j<len2;i++,j++) {
			mer[index++]=a[i];
			mer[index++]=ar[i];
		}
		while(i<len1) {
			mer[index++]=a[i++];
		}
		while(j<len2) {
			mer[index++]=ar[j++];
		}
		return mer;
	}

	public static void main(String[] args) {
		int arr[]= {1,5,6};
		int ar[]= {1,2};
		//sort(arr);
		int mer[]=merge(arr,ar);
		System.out.println(Arrays.toString(mer));
		

	}

}
