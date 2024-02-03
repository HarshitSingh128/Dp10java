package com.overriding;
class Bank{
	private double pamount;
	protected double roi;
	Bank(){
}
	Bank(double pamount,double roi){
		this.pamount=pamount;
		this.roi=roi;
	}
	public void setPamount(double pamount) {
		this.pamount=pamount;
	}
	public double getPamount() {
		return pamount;
	}
	public void showrate() {
		System.out.println("Bank: Interestrate:"+roi);
	}
	public String toString() {
		return "Bank:Pamount"+pamount+"Rate of interst:"+roi;
		}
}
class SavingAccount extends Bank{
	SavingAccount(){
		
	}
	SavingAccount(double pamount,double roi){
		super(pamount,roi);
	}
	public void showrate() {
		System.out.println("SavingAccount: Interstrate:"+roi);
	}
}
class CurrentAccount extends Bank{
	CurrentAccount(){
}
	CurrentAccount(double pamount,double roi){
		super(pamount ,roi);
	}
	public void showrate() {
		System.out.println("CurrentAccount:Interstret:"+roi);
		
	}
}	

public class Bankcal {

	public static void main(String[] args) {
		Bank b1=new Bank(10000,0.2);
		b1.showrate();
		SavingAccount s1=new SavingAccount(150000,0.3);
        s1.showrate();
        CurrentAccount c1=new CurrentAccount(14000,3.5);
        c1.showrate();
		

	}

}
