package Com.demo.loop;

import java.util.Scanner;

public class Assign1_23 {
	public static void series4(int n) {
		int i = 0;
		int sum;
		for (i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				sum = i + i;
				System.out.println(sum);
			} else {
				sum = -i - i;
				System.out.println(sum);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		int n = sc.nextInt();
		series4(n);

	}

}
