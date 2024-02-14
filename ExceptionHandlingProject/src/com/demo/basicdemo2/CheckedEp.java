package com.demo.basicdemo2;

import java.io.IOException;

public class CheckedEp {
	void method3() throws IOException{
		throw new IOException("Invalid Input");
	}
	void method2() throws IOException{
		method3();
	}
	void method1() {
		try {
			method2();
		}
		catch(Exception e){
			System.out.println(e);
			
		}
	}

	public static void main(String[] args) {
		CheckedEp c1=new CheckedEp();
		c1.method1();
		

	}

}
