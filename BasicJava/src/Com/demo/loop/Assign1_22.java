package Com.demo.loop;

import java.util.Scanner;

public class Assign1_22 {
	public static void Series2(int n) {
		int i;
		int sum = 1;
		for (i = 0; i <= n; i++) {
			sum = i + sum;
			//System.out.println(i);
			System.out.println (sum);

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		int n = sc.nextInt();
		Series2(n);

	}

}
