package com.demo.revision;
class Flower{
	void m1() {
		System.out.println("m1");
	}
	static void m2() {
		System.out.println("Static m2");
	}
	void m4() {
		System.out.println("m4");
	}
}
class Rose extends Flower{
	void m1() {
		System.out.println("Rose m1");
		
	}
	void m3() {
		System.out.println("Rose m3");
	}
}
public class Test {

	public static void main(String[] args) {
		Flower f;
		f=new Flower();
		f.m1();
		f.m2();
		//Flower.m2();m2 method is static method we can access both the way 
		f.m4();
		f=new Rose();
		f.m1();
		//f.m3(); we can not because m3 method is not present in Flower class
		Rose r1=new Rose ();
		r1.m3();
		
		
	}

}
