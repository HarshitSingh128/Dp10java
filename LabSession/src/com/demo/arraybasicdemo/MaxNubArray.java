package com.demo.arraybasicdemo;

import java.util.Arrays;

public class MaxNubArray {
	static void maxarray(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
				
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Largest Nub:"+max);
	}
	static void minarray(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Minimum nub:"+min);
		
	}

	public static void main(String[] args) {
		int ar[]= {2,24,45,7,};
		maxarray(ar);
		minarray(ar);
	
	}

}
