package com.demo.outputquestions;

class Car {
	static int wheels;
	static String color = "Red";
	static {
		m1();
	}
	static {
		m1();
	}
	{
		System.out.println(++wheels);
	}
	{
		++wheels;
	}

	Car(String color) {
		this.color = color;
	}

	static void m1() {
		System.out.println(color);
	}

	
	
	
}

public class Out_1 {

	public static void main(String[] args) {
		Car bmw = new Car("red");
		//Car wagonR = new Car("blue");
		System.out.println(bmw.wheels);
		System.out.println(bmw.color);

	}

}
