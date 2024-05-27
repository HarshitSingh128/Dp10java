package Com.demo.oops;

public class Bank {

	private long accno;
	private String name;
	private double balance;

	public void setData(long accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;

	}

	public void Display() {
		System.out.println("Accno:" +accno);
		System.out.println("Name :" +name);
		System.out.println("balance is :" +balance);
	}

	// setters or getters
	// setters -void with parameter
	// getter -return type (data type) without parameter no void
	public void setAccno(long accno) {
		this.accno = accno;

	}

	public long getAccno() {
		return accno;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

}
