package com.demo.practice;

import java.util.Arrays;

public class Eventest {
public static void evenoddseprate(int a[]) {
	int temp=a[a.length-1];
	for(int i=a.length-1;i>0;i--) {
		a[i]=a[i-1];
	}
	     a[0]=temp;
	System.out.println(Arrays.toString(a));
}
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	for(int i=0;i<2;i++) {
		
	
	 evenoddseprate(arr);
	}
	
}

}
