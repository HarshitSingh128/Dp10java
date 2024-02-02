package Com.demo.oops;

public class TestBank {

	public static void main(String[] args) {
	 Bank b1=new Bank();
	 b1.setData(101,"priya",1000);
	 b1.setBalance(5000);
	 b1.Display();
	 System.out.println(b1.getBalance());

	}

}
