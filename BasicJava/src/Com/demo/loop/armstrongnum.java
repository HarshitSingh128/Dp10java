package Com.demo.loop;

import java.util.Scanner;

public class armstrongnum {
	public static int countdigit(int num) {
		int count = 0;
		while (num != 0) {
			count++;
			num /= 10;

		}
		return count;
	}

	public static int power(int base, int pow) {
		int i;
		int p = 1;
		for (i = 1; i <= pow; i++) {
			p *= base;
		}
		return p;
	}

	public static boolean testarmstrong(int num) {
		int pow = countdigit(num);
		int original = num;
		int rem, sum = 0;
		while (num > 0) {
			rem = num % 10;
			sum = sum + power(rem, pow);
			num /= 10;

		}
		return original == sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		int num = sc.nextInt();
		System.out.println("Enter base=");
		int base = sc.nextInt();
		System.out.println("Enter power");
		int power = sc.nextInt();
		countdigit(num);
		power(base, power);

		boolean status = testarmstrong(num);
		if (status)
			System.out.println("Armstrong");
		else
			System.out.println("no armstrong");

	}

}
