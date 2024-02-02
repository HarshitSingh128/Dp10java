package Com.demo.loop;

import java.util.Scanner;

public class Assignment1_11 {
	public static void prime(int l, int u) {
		int i, j, count = 0;
		for (i = 1; i < u; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
               break;
				}
			}
			if (j == i) {
                count++;
				System.out.println(i);
			}

		}
		System.out.println("count is :" + count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter lower limit=");
		int l = sc.nextInt();
		System.out.println("Please enter upper limit=");
		int u = sc.nextInt();
		prime(l, u);

	}

}
