package Com.demo.loop;

import java.util.Scanner;

public class fibonaciSeriesP {
	public static void Series5(int n) {
		int i, n1 = 0;
		int n2 = 1;
		int n3;
		System.out.println("the seies is =" + n1 + " " + n2);

		for (i = 0; i <= n; i++) {
			n3 = n1 + n2;
			System.out.println("Series is =" + n3);
			n1 = n2;
			n2 = n3;

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n=");
		n = sc.nextInt();
		Series5(n);

	}

}
