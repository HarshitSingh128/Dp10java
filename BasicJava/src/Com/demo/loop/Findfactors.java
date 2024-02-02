package Com.demo.loop;

import java.util.Scanner;

public class Findfactors {
	public static void factors(int n) {
		int i;
		int count = 0;
		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("No of factors is =" + count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n=");
		n = sc.nextInt();
		factors(n);

	}

}
