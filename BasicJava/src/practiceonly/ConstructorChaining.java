package practiceonly;

class Sum {
	int a;
	int b;
	int c;

	Sum() {
		this(10, 20);

	}

	Sum(int a, int b) {
		this.a = a;
		this.b = b;
		int sub1 = a - b;
		System.out.println(sub1);
	}

	Sum(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public void add() {
		int add = a + b + c;
		System.out.println(add);
	}

}

public class ConstructorChaining {

	public static void main(String[] args) {
		Sum s2 = new Sum();
		Sum s1 = new Sum(10, 20, 30);

		s1.add();

	}

}
