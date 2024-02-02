package Com.demo.loop;

import java.util.Scanner;

public class Assigment1_17 {

	public static void Disarium(int num) {
		int sum = 0;
		int rem;
		int temp = num;
		int count = 0;
		while (temp > 0) {
			rem = temp % 10;
			temp = temp / 10;

			count++;

			// sum = sum + (int) Math.pow(rem, count);
		}
		int temp1 = num;
		while (num > 0) {
			int rem1;
			rem1 = num % 10;
			sum = sum + (int) Math.pow(rem1, count);
			count--;
			num /= 10;
		}
		if (temp1 == sum)
			System.out.println("Disarium no=");
		else

			System.out.println("Not disarium no=");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		int num = sc.nextInt();
		Disarium(num);

	}

}
