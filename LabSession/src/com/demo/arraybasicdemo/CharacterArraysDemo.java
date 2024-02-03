package com.demo.arraybasicdemo;

import java.util.Arrays;

public class CharacterArraysDemo {
	static void charCheck(char A[]) {
		System.out.println("Vowels are:");
		for(int i=0;i<A.length;i++) {
			if(A[i]=='a'|| A[i]=='e'|| A[i]=='i'||A[i]=='o'||A[i]=='u') {
				
			System.out.println(A[i]);
			
		}
			
		}
		
		System.out.println(Arrays.toString(A));
	}

	public static void main(String[] args) {
		char AB[]= {'a','b','c','d','e','i','o','u'};
		charCheck(AB);
		

	}

}
