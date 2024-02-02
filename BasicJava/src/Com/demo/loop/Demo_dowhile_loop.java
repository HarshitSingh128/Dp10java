package Com.demo.loop;

import java.util.Scanner;

public class Demo_dowhile_loop {
	public static void Prctice(int num) {
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i <= num);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter n=");
		num = sc.nextInt();
		Prctice(num);

	}

}
