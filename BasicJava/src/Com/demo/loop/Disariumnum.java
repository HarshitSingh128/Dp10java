package Com.demo.loop;

import java.util.Scanner;

public class Disariumnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		int num = sc.nextInt();
		int temp = num;
		int count = 0;
		int sum = 0;
		while (temp > 0) {
			int rem = num % 10;
			count++;
			temp = temp / 10;

		}
		int temp1 = num;
		while (num > 0) {
			int fact = 1;
			int rem = num % 10;
			int i;
			for (i = 1; i <= count; i++) {
				fact= rem * fact;

			}
			System.out.println(fact);

			sum = sum + fact;
			num = num / 10;
			count--;

		}

		if (temp1 == sum) {
			System.out.println("Disarium no=");
		} else
			System.out.println("Not disarium no=");

	}

}
