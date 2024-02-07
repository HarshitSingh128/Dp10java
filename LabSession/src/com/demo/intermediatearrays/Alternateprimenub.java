package com.demo.intermediatearrays;
//8>> Print alternate prime number in an array
public class Alternateprimenub {
	public static void primeTest(int a[]) {
		boolean flag = true;
		for (int i = 0; i < a.length; i=i+2) {
			flag = true;
			if (a[i] > 1) {
				for (int j = 2; j < a[i]; j++) {
					if (a[i] % j == 0 && j%2==0 ) {
						j++;
						flag = false;
						break;
					}
				}
				if (flag == true) {
					System.out.println("Prime :" + a[i]);

				}
			}
		}

	}

	public static void main(String[] args) {
		int ar[] = { 2, 3, 5, 7, 11, 5 ,3};
		primeTest(ar);

	}

}
