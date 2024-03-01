package com.demo.practice;

import java.util.Arrays;
//5.  WAP to print reverse of an array. Also print every alternate element backwards.
public class ReverseTest {
	public static void reversearryas(int a[]) {
		int i,j;
		for ( i=0,j=a.length-1;i<a.length/2; i++,j--) {
			
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
					
		}
		System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		int ar[] = { 2, 4, 5, 6, 8 };
		System.out.println(Arrays.toString(ar));
		reversearryas(ar);

	}

}
