package Com.demo.Switch1;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin = 1234;
		int amount = 20000;
		char ch = 0;
		int flag = 0;
		System.out.println("----WELCOME TO HDFC BANK-----");
		System.out.println("Please Enter your name= ");
		String name = sc.next();
		System.out.println("Please Enter Your pin:");
		int Enterpin = sc.nextInt();
		// do {
		if (pin == Enterpin) {

			flag = 1;
		}
		if (flag == 1) {

			do {
				System.out.println("1.withdrawal\n2.Balance enqiry\n3.Deposit");
				System.out.println("Enter your choice");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Your previous balance  is =" + amount);
					System.out.println("Enter money to be withdraw;");
					int withdraw = sc.nextInt();
					if (amount >= withdraw) {
						amount = amount - withdraw;
						System.out.println("Please collect your money=");
						System.out.println("Your current balance is=" + amount);
						System.out.println("Thank you:::" + name);
					} else {
						System.out.println("Insufficient Balance");
					}

					// System.out.println("Do you want to continue ?? if yes enter Y");
					// ch = sc.next().charAt(0);
					break;

				case 2:
					System.out.println("Your previous balance is =" + amount);
					System.out.println("Thank you:::" + name);
					// System.out.println("Do you want to continue ?? if yes enter Y");
					// ch = sc.next().charAt(0);

					break;
				case 3:
					System.out.println("Enetr deposit amount:");
					int deposit = sc.nextInt();
					deposit = amount + deposit;
					System.out.println("Your current balance is =" + deposit);
					break;
				// NOTES PROBLEM PASTE HERE
				default:
					System.out.println("You enter invalid choice");

				}

				System.out.println("Do you want to continue ?? if yes enter Y");
				ch = sc.next().charAt(0);
			} while (ch == 'y' || ch == 'Y');
		}

		else {
			System.out.println("Your pin is wrong");
		}

	}
}
