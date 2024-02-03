package com.demo.interfacedemo;

//Task2>>
//Create an online shopping which has various modes to paythe Bill
//If paid through cash.. no discount
//Paytm ... above 1000,, cashback 500
//Credit card .. any amount : 20% discount
//Debit card.... above 5000 : 20% discount
//Try to the pay bill using different modes
interface Shopping {
	void payment(int amount);

}

class Paytm implements Shopping {

	@Override
	public void payment(int amount) {
		if (amount > 1000) {
			System.out.println("You got a 500 cash Of your shopping ");
		} else {
			System.out.println("Your are getting cashback ");
		}
	}

}

class CreditCard implements Shopping {

	@Override
	public void payment(int amount) {
		if (amount != 0) {
			System.out.println("You will get 20% discount on any item");
		}

	}

}

class DebitCard implements Shopping {

	@Override
	public void payment(int amount) {
		if (amount > 5000) {
			System.out.println("You will get 20% discount on any item");
		}

	}

}

class Cash implements Shopping {

	@Override
	public void payment(int amount) {
		if (amount > 10000) {
			System.out.println("You will get 50% discount on each item");
		}

	}

}

public class Customer {

	private Shopping s;
	private int amount;

	public Shopping getS() {
		return s;
	}

	public void setS(Shopping s) {
		this.s = s;
	}

	public void shop(int amount) {
		this.amount = amount;
		s.payment(amount);

	}

	public static void main(String[] args) {
//		Shopping s;
//		s = new Paytm();
//		s.payment(2000);
//		s = new CreditCard();
//		s.payment(500);
//		s = new DebitCard();
//		s.payment(6000);
//		s = new Cash();
//		s.payment(11000);
		Customer c = new Customer();
		c.setS(new Cash());
		c.shop(6000);
	}

}
