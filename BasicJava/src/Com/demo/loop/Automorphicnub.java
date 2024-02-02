package Com.demo.loop;

import java.util.Scanner;

public class Automorphicnub {
	public static void automorphic(int num) {

		int rem;
		double num1;
		int temp = num;
		double power = 1;
		int square = num * num;

		int count = 0;
		while (num > 0) {
			rem = num % 10;
			num = num / 10;
			count++;
		}
		System.out.println("count is =" + count);
		power = Math.pow(10, count);
		System.out.println("Power is=" + power);
		num1 = square % power;
		if (num1 == temp) {
			System.out.println("automorphic");
		} else
			System.out.println("not automorphic");

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		int num = sc.nextInt();
		automorphic(num);
	}

}
