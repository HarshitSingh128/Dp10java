package com.demo.abstractdemo;
//Task2>>

//Write a Java program to create an abstract class Shape with abstract methods calculateArea()
// and calculatePerimeter(). 
//Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods 
//to calculate the area and perimeter of each shape.

abstract class Shape {
	abstract void calculateArea();

	abstract void calculatePerimeter();

}

class Circle extends Shape {
	int rad = 4;

	@Override
	void calculateArea() {
		double area = 3.14 * rad * rad;
		System.out.println("Area of Circle is  :" + area);

	}

	@Override
	void calculatePerimeter() {
		double peri = 2 * 3.14 * rad;
		System.out.println("Perimeter is:" + peri);

	}

}

class Triangle extends Shape {
	int lenght = 2;
	int breadth = 3;

	@Override
	void calculateArea() {
		double area = lenght * breadth;
		System.out.println("Area of Triangle is:" + area);

	}

	@Override
	void calculatePerimeter() {
		double peri = 2 * (lenght + breadth);
		System.out.println("Perimeter of Triangle is: " + peri);

	}

}

public class AreaCalculation {

	public static void main(String[] args) {
		Shape s;
		s = new Circle();
		s.calculateArea();
		s.calculatePerimeter();
		s = new Triangle();
		s.calculateArea();
		s.calculatePerimeter();

	}

}
