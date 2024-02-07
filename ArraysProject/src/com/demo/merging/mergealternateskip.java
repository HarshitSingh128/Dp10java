package com.demo.merging;

import java.util.Arrays;

public class mergealternateskip {
	public static int [] mergealternateskipTest(int a1[],int a2[]) {
		int len1=a1.length;
		int len2=a2.length;
		int maxlength=Math.max(len1, len2);
		int mar[]=new int[maxlength];
		int index=0;
		int i=0;
		while(index <maxlength) {
			if(i<a1.length) {
				mar[index++]=a1[i++];
			}
			if(i<a2.length) {
				mar[index++]=a2[i++];
				
			}
		}
		return mar;
	}

	public static void main(String[] args) {
		int	arr1[]= {2,3,4,5};
		int arr2[]= {2,7,8,9,5,7,8,7};
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		int mer[]=mergealternateskipTest(arr1, arr2);
		System.out.println("After alternatily skiping element");
		System.out.println(Arrays.toString(mer));
	

	}

}
