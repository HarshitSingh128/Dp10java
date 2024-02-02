package com.demo.enhancedloop;

import java.util.Arrays;

public class SumofEven {

	public static void main(String[] args) {
		int b[]= {2,4,5,7,8};
		System.out.println(Arrays.toString(b));
		int sum=0;
		for(int x:b) {
			if(x%2==0) {
				sum+=x;
			}
		}
		System.out.println(sum);

	}

}
