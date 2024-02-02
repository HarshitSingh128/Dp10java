package Com.demo.constructor;

class Testdemo {
	int a, b;
	String name;

	Testdemo() {
		this(10, 20, "Pooja");
		this.a = 10;
		this.b = 20;
		System.out.println("Default constuctor");

	}

	Testdemo(int a, int b) {
		System.out.println("para const");
		this.a = a;
		this.b = b;

		System.out.println(a);
		System.out.println(b);

	}

	Testdemo(int a, int b, String name) {
		this.a = a;
		this.b = b;
		this.name = name;
		System.out.println(a);
		System.out.println(b);
		System.out.println(name);
	}
}

public class constructorchainingDemo {

	public static void main(String[] args) {
		Testdemo d1 = new Testdemo();
		Testdemo d2 = new Testdemo(10, 20);

	}

}
