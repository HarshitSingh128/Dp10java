package Com.demo.inheritance;

class Parent {
	int value;

	Parent() {

	}

	Parent(int value) {
		System.out.println("in parent class para constructor");
		this.value = value;
	}
}

class Child extends Parent {
	int data;

	Child() {

	}

	Child(int data, int value) {
		super(value);
		this.data = data;
		System.out.println("In child class paraconstructor:");

	}
	
}

public class Superusage {
	public static void main(String[] args) {
		Child c = new Child(10, 100);
		System.out.println("Data:" + c.data);
		System.out.println("Value:" + c.value);

	}

}
