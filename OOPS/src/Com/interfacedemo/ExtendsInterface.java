package Com.interfacedemo;

interface Movable {
	void move();
}

interface Printable extends Movable {

	void displayMsg();

}

class Printer implements Printable {

	@Override
	public void move() {
		System.out.println("LasePrinter is printing at hight speed ");

	}

	@Override
	public void displayMsg() {
		System.out.println("Printer are wifi connected--");

	}

}
class Car implements Movable{

	@Override
	public void move() {
	System.out.println("Car is moving at 50km/hr");
		
	}
	
	
}
public class ExtendsInterface {

	public static void main(String[] args) {
		Movable m;
		m=new Printer();
		m.move();
		m=new Car();
		m.move();
		Printer p;
		p=new Printer();
		p.move();
		p.displayMsg();
		

	}

}
