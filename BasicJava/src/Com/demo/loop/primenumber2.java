package Com.demo.loop;

import java.util.Scanner;

public class primenumber2 {
	public static void prime(int n) {
		int i;
		int count = 0;

		for (i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				count++;
				break;

			}
		}
		if (count == 0) {
			System.out.println("Number is prime=");
		} else {
			System.out.println("Number is not prime=");
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
