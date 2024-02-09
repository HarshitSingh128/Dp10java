package com.demo.arraysInfo;

import java.util.Arrays;

public class Maxvalue1 {
	public static void Maxtest(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Maximum element is:");
		System.out.println(max);
		
	}

	public static void main(String[] args) {
		int ar[]= {20,0,31,45,100,1,105,90};
		Maxtest(ar);
		
				

	}

}
