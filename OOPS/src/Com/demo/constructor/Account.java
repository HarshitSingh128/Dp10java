package Com.demo.constructor;

public class Account {
	private long acc_no;
	private String name;
	private double amount;
	private double withdraw;
	private double deposit;
	Account(){
	}
	Account(long acc_no,String name,double amount){
		this.acc_no=acc_no;
		this.name=name;
		this.amount=amount;
	}
	public void insertdata(long acc_no,String name,double amount) {
		this.acc_no=acc_no;
		this.name=name;
		this.amount=amount;
	}
	public void setAccnumber(long acc_no) {
		this.acc_no=acc_no;
		
	}
	public long getAccnumber() {
		return acc_no;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAmount(double amount) {
		this.amount=amount;
		
	}
	public double getAmount() {
		return amount;
	}
	public void Checkwithdraw(double withdraw) {
		this.withdraw=withdraw;
		double balance=amount;
		withdraw=(balance-withdraw);
	}
	public void checkDeposit(double deposit) {
	this.deposit=deposit;
	double balance=amount;
	deposit=deposit+balance;
	
	}
	public String toString() {
		return "Accont"+acc_no+" "+name+" "+amount+withdraw+" "+deposit;
		
	}
}


