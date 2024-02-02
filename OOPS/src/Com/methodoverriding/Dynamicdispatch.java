package Com.methodoverriding;
class Bank{
	void display() {
		double rate=8;
		System.out.println("Bank rate is:"+rate);
	}
}
class Sbibank extends Bank{
	void dispaly() {
		double rate =10;
		System.out.println("SBI bank rate is :"+rate);
	}
}
class HDFCbank extends Bank{
	void display() {
		double rate =9;
		System.out.println("HDFC bank rate is :"+rate );
	}
}

public class Dynamicdispatch {

	public static void main(String[] args) {
		Bank b;
		//b.display();
		b=new HDFCbank();
		//b.display();
		Sbibank S1=new Sbibank();
		//S1.display();

	}

}
