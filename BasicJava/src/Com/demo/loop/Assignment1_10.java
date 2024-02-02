package Com.demo.loop;

import java.util.Scanner;

public class Assignment1_10 {
	public static void frequency(int num) {
		int i;
		for (i = 0; i <= 9; i++) {
			int count = 0;
			int temp = num;
			int rem = 0;
			while (temp > 0) {
				rem = temp % 10;
				if (rem == i) {
					count++;
				}
				temp = temp / 10;
			}
			if (count > 0) {
				System.out.println(i + "\t" + count);

			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter n=");
		num = sc.nextInt();
		System.out.println("Digit\tFrequency");
		frequency(num);

	}

}
