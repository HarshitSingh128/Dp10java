package Com.interfacedemo;

interface Operations {
	void area();

	default void volume() {
		show();
		//display();
		System.out.println("volume method");
	}
	static void Info() {
		display();
		System.out.println("Geometry shape");
	}
	static double getPi() {
		return 3.147;
	
	}
	private void show() {
		System.out.println("Made for:Shuruti");
	}
  private static void display() {
	  System.out.println("Pan No:0235KG20");
  }
}

class Square implements Operations {
	int side;

	Square() {

	}

	Square(int side) {
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("Area is:" + (side * side));

	}
}

class Cube implements Operations {
	int side;

	Cube() {
	}

	Cube(int side) {
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("Area is :" + (6 * side * side));

	}

	public void volume() {
		System.out.println("Area of cube is:" + (side * side * side));
	}
}

public class DefaultMethodDemo {

	public static void main(String[] args) {
		Operations.Info();
		System.out.println("Value of Pi:"+(Operations.getPi()));
		Operations.getPi();
		Operations o;
		o=new Square(6);
		o.area();
		o.volume();
		o=new Cube(9);
		o.area();
		o.volume();
			

	}

}
