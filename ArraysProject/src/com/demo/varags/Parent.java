package com.demo.varags;
//we can override the method having  varrags ,array 
class Parent1{
	void display(int ...a) {
		System.out.println("In parent");
	}
	void show(String ...s) {
		System.out.println("In show ");
		
	}
	
}
class Child extends Parent1{
	
	
}

public class Parent {
	

	public static void main(String[] args) {
		
	}

}
