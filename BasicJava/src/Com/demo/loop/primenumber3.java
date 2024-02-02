package Com.demo.loop;

import java.util.Scanner;

public class primenumber3 {
	public static int countfactors(int n) {
		int i;
		int count = 0;
		for (i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}

	public static boolean checkprime(int n) {
		int count = countfactors(n);
		if (count == 2)
			return true;
		else
			return false;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n=");
		n = sc.nextInt();
		countfactors(n);
		checkprime(n);
		boolean status = checkprime(n);
		if (status)
			System.out.println("prime");
		else
			System.out.println("Not prime");

	}

}
