package Com.demo.loop;

import java.util.Scanner;

public class Assignment1_16 {
	public static void krishna(int num) {
		int temp = num;
		int rem;
		int sum = 0;
		int i;
		while (num > 0) {
			int fact = 1;
			rem = num % 10;

			for (i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			num = num / 10;
		}
		System.out.println(sum);
		if (temp == sum) {
			System.out.println("Krishnamurti number=");
		} else {
			System.out.println("not k number=");

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter n=");
		num = sc.nextInt();
		krishna(num);

	}

}
