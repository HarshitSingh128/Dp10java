package Com.demo.loop;

import java.util.Scanner;

public class Demo_dowhile2 {
	public static void add(int a, int b) {
		System.out.println("add=" + (a + b));
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b;
		char ch;
		do {
			System.out.println("Enter num1=");
			a = sc.nextInt();
			System.out.println("Enter num2=");
			b = sc.nextInt();
			add(a, b);
			System.out.println("do you want to continue ?? if yes enter Y=");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');
		System.out.println("Thank you");

	}

}
