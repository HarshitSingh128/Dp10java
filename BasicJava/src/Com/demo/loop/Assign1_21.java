package Com.demo.loop;

import java.util.Scanner;

public class Assign1_21 {
	public static void Series1(int n) {
		int i;
		int sum = 0;
		for (i = 1; i <= n; i++) {
			sum = i * i;
			//System.out.println(i);
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		int n = sc.nextInt();
		Series1(n);

	}

}
