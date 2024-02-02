
package Com.demo.loop;

import java.util.Scanner;

public class prime_number {
	public static void prime(int n) {
		int i;
		int count = 0;
		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				count++;
			}

		}
		if (count == 2) {
			System.out.println("Number is prime number=");
		} else {
			System.out.println("Number is not prime number=");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n=");
		n = sc.nextInt();
		prime(n);

	}

}
