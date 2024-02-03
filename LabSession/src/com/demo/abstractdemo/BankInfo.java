package com.demo.abstractdemo;

import java.util.Scanner;

//Task1>> 
//Write a Java program to create an abstract class BankAccount with abstract methods deposit() 
//and withdraw().
//Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class 
//and implement the respective methods to handle deposits and withdrawals for each account type.
abstract class BankAccount {

	abstract void Withdraw(double withdraw);

	abstract void deposit(double deposit);

	double amount = 20000;

}

class SavingsAccuont extends BankAccount {

	@Override
	void Withdraw(double withdraw) {
		amount = amount - withdraw;
		System.out.println("Current Balance:" + amount);

	}

	@Override
	void deposit(double deposit) {
		amount = deposit + amount;
		System.out.println("Available balance: " + amount);
	}

}

class CurrentAccount extends BankAccount {

	@Override
	void Withdraw(double withdraw) {
		amount = amount - withdraw;
		System.out.println("Current Balance:" + amount);

	}

	@Override
	void deposit(double deposit) {
		amount = deposit + amount;
		System.out.println("Available balance: " + amount);

	}

}

public class BankInfo {

	public static void main(String[] args) {

		BankAccount b;
		b = new SavingsAccuont();
		b.deposit(4000);
		b.Withdraw(4500);
		b = new CurrentAccount();
		b.deposit(20000);
		b.Withdraw(2000);

	}

}
