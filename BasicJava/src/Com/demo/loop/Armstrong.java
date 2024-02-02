package Com.demo.loop;

import java.util.Scanner;

public class Armstrong {
	public static void armstrong1(int num) {
		int temp = num;
		int sum = 0;
		int rem;
		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;

		}
		if (temp == sum) {
			System.out.println("Number is armstrong=");
		} else
			System.out.println("Number is not armstrong=");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter n=");
		num = sc.nextInt();
		armstrong1(num);
		

	}

}
