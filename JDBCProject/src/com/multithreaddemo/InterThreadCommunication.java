package com.multithreaddemo;

import java.util.Scanner;

class Account{
	volatile int balance=2000;
	synchronized void deposit() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Deposit Amount");
		int damount=sc.nextInt();
		balance=balance+damount;
		System.out.println("Balance after deposit:"+balance);
	}
	synchronized  void withdraw(int wamount) throws InterruptedException {
		if(balance <wamount) {
			wait();
			System.out.println("Cant withdraw");
		}
		balance=balance-wamount;
		System.out.println("Balance after withdraw:"+balance);
	}
	
}
class Person1 extends Thread{
	Account a;
	Person1(Account a){
		this.a=a;
		this.start();
	}
	public void run() {
		try {
			a.withdraw(3000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
class Person2 extends Thread{
	Account a;
	Person2(Account a){
		this.a=a;
		this.start();
		
	}
	public void run() {
		try {
			a.withdraw(3000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
class DepositThread extends Thread{
	Account a;
	DepositThread(Account a){
		this.a=a;
		this.start();
	}
	public void run() {
		a.deposit();
	}
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		Account a=new Account();
		Person1 p1=new Person1(a);
	Person2 p2=new Person2(a);
		
		DepositThread d=new DepositThread(a);

	}

}
