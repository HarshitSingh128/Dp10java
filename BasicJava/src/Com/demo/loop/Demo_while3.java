package Com.demo.loop;

import java.util.Scanner;

public class Demo_while3 {
	public static void natural(int n) {
		int i = 1;
		int sum = 0;
		while (i <= n) {
			sum = sum + i;
			i++;

		}
		System.out.println("sum of natural num is ="+sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n=");
		n = sc.nextInt();
		natural(n);

	}

}
