package Com.demo.constructor;

import java.util.Scanner;

public class TestAccount {
	static Scanner sc=new Scanner(System.in);
	public static void Display(Account a) {
		System.out.println("Enter Accoun number :");
		a.setAccnumber(sc.nextLong());
		System.out.println("Enter Your Name :");
		a.setName(sc.next());
		System.out.println("Enter Amount");
		a.setAmount(sc.nextDouble());
	}

	public static void main(String[] args) {
	Account a1=new Account();
	Display(a1);
	a1.Checkwithdraw(2000);
	a1.checkDeposit(15000);
	System.out.println(a1);
	System.out.println();

	}

}
