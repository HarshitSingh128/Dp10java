package com.demo.merging;

import java.util.Arrays;

//3>>Write a program to reverse an array in following manner.
//Suppose array size is even then later half should come first and first half 
//should go last. E.g. input array { 1,2,5,7,3,4} output will be { 7,3,4, 1,2,5}. 
//If array size is even then middle element should remain as it is and array will be
// reversed as above. E.g. input array { 5,22,55,21,4,54,10} output will be {4,54,10,21,5,22,55}
public class Halfreversearary {
	public static void reverseeventest(int a[]) {
		int index = 0;
		int arr1[] = new int[6];

		for (int i = a.length / 2; i < a.length; i++) {
			arr1[index++] = a[i];
		}
		for (int j = 0; j < a.length / 2; j++) {
			arr1[index++] = a[j];
			

		}
    System.out.println(Arrays.toString(arr1));
   }
	public static void reverseoddtest(int a[]) {
		int index=0;
		int arr1[]=new int[7];
		for(int i=a.length/2;i<a.length;i++) {
			arr1[index++]=a[i];
		}
		for (int j = 0; j < a.length / 2; j++) {
			arr1[index++] = a[j];
			

		}
		System.out.println(Arrays.toString(arr1));
	}

	public static void main(String[] args) {
		int ar[] = { 1, 2, 5, 7, 3, 4 };
		int ar1[]={ 5,22,55,21,4,54,10};
		//reverseeventest(ar);
		reverseoddtest(ar1);

	}

}
