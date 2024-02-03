package com.demo.arraybasicdemo;

import java.util.Arrays;

public class PrimeTest {
	public static void primearrays(int a[]) {
		boolean flag= true;
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}
		System.out.println(Arrays.toString(a));
		System.out.println("Prime elements is:");
		for (int i = 0; i < a.length; i++) {
			flag = true;
			if (a[i] > 1) {
				for (int j = 2; j < a[i]; j++) {
					if (a[i] % j == 0) {
						flag = false;
						break;
					}
				}
				if (flag == true) {
					System.out.println(a[i]);
				}
			}

		}

	}

	public static void main(String[] args) {
		int ar[] = { 2, 4, 5, 7, 9, 11 };
		primearrays(ar);
	}

}
