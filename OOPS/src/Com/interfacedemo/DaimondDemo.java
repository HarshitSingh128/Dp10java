package Com.interfacedemo;
//daimond problem question
interface one{
	default void print() {
		System.out.println("One");
	}
		abstract void show();
	}
interface two extends one{
	default void print() {
		one.super.print();
		System.out.println("Two");
		
	}
}
interface three extends one{
	default void print() {
		System.out.println("Three");
	}
}
class Main implements two,three{
	@Override
	public void print() {
		three.super.print();
		two.super.print();
		System.out.println("Main");
		
	}
	@Override 
	public void show() {
		System.out.println("Main show");
	}
}

public class DaimondDemo {

	public static void main(String[] args) {
		Main m=new Main();
		m.print();
		m.show();
		

	}

}
