package com.demo.revision;
interface Demo1{
	default void display() {
		System.out.println("In demo1");
	}
}
interface Demo2{
	default void display() {
		System.out.println("In demo2");
	}
}

public class Democlass implements Demo1,Demo2{
	public void display() {
		Demo1.super.display();
		Demo2.super.display();
	}

	public static void main(String[] args) {
		Democlass obj=new Democlass();
		obj.display();
		
		

	}

}
