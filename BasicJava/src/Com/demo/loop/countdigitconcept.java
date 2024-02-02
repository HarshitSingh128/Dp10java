package Com.demo.loop;

import java.util.Scanner;

public class countdigitconcept {
	public static void seperatenumbers(int num) {
		int rem;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			System.out.println(rem);
			System.out.println(num);

		}
		System.out.println("original number=" + num);
	}

	public static void countdigits(int num) {
		int rem;
		int count = 0;
		while (num != 0) {
			rem = num % 10;
			num = num / 10;
			count++;
		}
		System.out.println("count=" + count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter n=");
		num = sc.nextInt();
		seperatenumbers(num);
		countdigits(num);

	}

}
