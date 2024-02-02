package Com.demo.oops;

public class test {
	public void method1() {
		System.out.println("h1 i am instance method");
	}

	public void show() {
		System.out.println("hello");
	}

	public static void main(String[] args) {
		test t1 = new test();
		t1.method1();
		t1.show();

	}

}
