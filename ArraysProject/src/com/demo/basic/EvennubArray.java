package com.demo.basic;

import java.util.Scanner;

public class EvennubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Size:");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		System.out.println("Enter elements ");
		System.out.println("Even Number:");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
			sc.close();

		}

	}

}
