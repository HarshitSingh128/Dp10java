package Com.demo.loop;

import java.util.Scanner;

public class Assignment1_9 {
	public static void product(int num) {
		int count = 0;
		int rem;
		int temp = num;

		int product = 1;
		while (num > 0) {
			rem = num % 10;
            num = num / 10;
			product = product * rem;

			count++;
		}
		System.out.println("product of digit is =" + product);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		int num = sc.nextInt();
		product(num);

	}

}
