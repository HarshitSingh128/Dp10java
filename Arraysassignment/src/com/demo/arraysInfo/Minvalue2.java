package com.demo.arraysInfo;

import java.util.Arrays;

public class Minvalue2 {
	public static void mintest(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(min);
	}
	

	public static void main(String[] args) {
		int arr[]= {-20,0,-25,15,19,37,23};
		mintest(arr);
	
	}

}
