package com.demo.basic;

import java.util.Arrays;
import java.util.Scanner;

public class SquareCubetest {
	public static int[] SquareTest(int a[]) {
		int sqr[] = new int[4];
		int j = 0;
		for (int i = 0; i < a.length; i++) {

			sqr[j++] = a[i] * a[i];

		}
		return sqr;

	}

	public static int[] Cubetest(int a[]) {
		int cube[] = new int[4];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			cube[k++] = a[i] * a[i] * a[i];

		}
		return cube;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Square\n2.Cube");
		System.out.println("Please Select one Option:");
		int choice = sc.nextInt();
		switch (choice) {

		case 1:
			int ar[] = { 1, 2, 5, 4 };

			System.out.println(Arrays.toString(ar));
			System.out.println(Arrays.toString(SquareTest(ar)));

			break;

		case 2:
			int a[] = { 1, 2, 5, 4 };
			System.out.println(Arrays.toString(a));
			System.out.println(Arrays.toString(Cubetest(a)));

			break;

		}

	}
}
