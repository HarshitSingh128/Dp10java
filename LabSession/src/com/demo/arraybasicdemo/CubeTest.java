package com.demo.arraybasicdemo;

import java.util.Arrays;

public class CubeTest {
	static void cubeDemo(int a[]) {
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]*a[i]*a[i];
		}
		System.out.println("Inside Method");
		System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		int ar[]= {2,4,2,4,5};
		cubeDemo(ar);
	}

}
