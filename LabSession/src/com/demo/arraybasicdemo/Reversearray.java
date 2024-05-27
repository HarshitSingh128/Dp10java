package com.demo.arraybasicdemo;

import java.util.Arrays;
import java.util.Scanner;

public class Reversearray {
	public static void reverseArray(int []arr) {
		int []arr1=new int [arr.length];
		int index=0;
		for(int i=arr.length-1;i>=0;i--) {
			arr1[index++]=arr[i];
		}
		System.out.println(Arrays.toString(arr1));
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size:");
		int arr[]=new int [sc.nextInt()];
		System.out.println("Enter Elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		reverseArray(arr);
	
		

	}

}
