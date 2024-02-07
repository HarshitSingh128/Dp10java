package com.demo.practice;
//1.  WAP to add elements to single dimensional int array and print elements from 1D array
//2.    WAP to accept dimension of 1D array and create and accept data in that array. Calculate the average value of array elements.

import java.util.Arrays;
import java.util.Scanner;

public class Singleadddemo {
	public static void average(int a[]) {
		int sum=0;
		double average;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		average=sum/a.length;
		System.out.println(sum);
		System.out.println(average);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter size: ");
		int size=sc.nextInt();
		int ar[]=new int[size];
		System.out.println("Enter elements ");
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(ar));
		average(ar);
		

	}

}
