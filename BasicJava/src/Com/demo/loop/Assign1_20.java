package Com.demo.loop;

import java.util.Scanner;

public class Assign1_20 {
	public static void Series(int n) {
		int i;
		int sum = 0;
		for (i = 10; i <= n; i++) {
			if(i%10==0)
			//sum = sum + 10;
			System.out.println(i);
			//System.out.println(sum);
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		int n = sc.nextInt();
		Series(n);

	}

}
