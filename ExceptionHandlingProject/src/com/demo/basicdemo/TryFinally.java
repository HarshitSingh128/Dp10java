package com.demo.basicdemo;
//it is possible try and finally together
public class TryFinally {

	public static void main(String[] args) {
		try {
			int a=10;
			System.out.println(a/0);
		}
		finally {
			System.out.println("Done ....");
			//catch -auto generated by jvm-abruptly stop
		}
		System.out.println("rest code ");

	}

}
