package Com.demo.loop;

import java.util.Scanner;

public class Assignment1_18 {
	public static void palindrome(int num) {
		int sum = 0;
		int rem;
		int temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("number is palindrome=");
		} else {
			System.out.println("Number is not palindrome=");

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter n=");
		num = sc.nextInt();
		palindrome(num);

	}

}
