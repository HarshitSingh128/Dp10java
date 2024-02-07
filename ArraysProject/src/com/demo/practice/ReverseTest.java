package com.demo.practice;

import java.util.Arrays;
//5.  WAP to print reverse of an array. Also print every alternate element backwards.
public class ReverseTest {
	public static void reversearryas(int a[]) {
		int index = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			a[index++] = a[i];
		}
		System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		int ar[] = { 2, 4, 5, 6, 8 };
		System.out.println(Arrays.toString(ar));
		reversearryas(ar);

	}

}
