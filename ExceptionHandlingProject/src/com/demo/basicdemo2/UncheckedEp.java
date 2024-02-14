package com.demo.basicdemo2;
//Exception propagation
public class UncheckedEp {
	void method3() {
		int data=50/0;
	}
	void method2() {
		method3();
	}
	void method1() {
		try {
			method2();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
	
		UncheckedEp u1=new UncheckedEp();
		u1.method1();
	}

}
