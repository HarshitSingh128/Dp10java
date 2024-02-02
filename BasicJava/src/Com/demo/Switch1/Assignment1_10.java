package Com.demo.Switch1;

import java.util.Scanner;

public class Assignment1_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		int max;
		System.out.println("Enter value of n1=");
		n1 = sc.nextInt();
		System.out.println("Enter value of n2=");
		n2 = sc.nextInt();
		System.out.println("Enter choice=");
		int choice = sc.nextInt();
		if (n1 > n2) {
			choice = 0;
		} 
		else 
		{
			choice = 1;

		}

		switch (choice) {
		case 0:
			System.out.println("n1 is greater=");
			break;
		case 1:
			System.out.println("n2 is grater");

			break;
		default:
			System.out.println("Both are equal=");

		}
	}

}
