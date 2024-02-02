package Com.interfacedemo;

interface Payment {
	void pay(double amount);
}

class Cake implements Bakery, Payment {

	@Override
	public void bake() {
		System.out.println("Variety:ButterScotch,Pineapple,Chocolate");

	}

	public void displayRates() {
		System.out.println("Pineapple:300");
		System.out.println("Chocolate:400");

	}

	@Override
	public void minorder() {
		System.out.println("500g");

	}

	@Override
	public void pay(double amount) {
		System.out.println("Payment done:" + amount);

	}

}

class Biscuit implements Bakery {

	@Override
	public void bake() {
		System.out.println("Variety :Almond ,chocochips");

	}

	@Override
	public void minorder() {
		System.out.println("250g");

	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		//Bakery b=new Bakery();
		System.out.println(Bakery.name);
		System.out.println("-------------");
		
		Cake c=new Cake();
		c.bake();
		c.displayRates();
		c.pay(520);
		Biscuit bs=new Biscuit();
		bs.bake();
		bs.minorder();
		
		Bakery b;
		b=new Cake();
		b.bake();
		b.minorder();
		
		b=new Biscuit();
		b.bake();
		b.minorder();
		
		

	}

}
