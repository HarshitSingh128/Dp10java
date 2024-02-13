package com.demo.basicdemo;

public class ReturnType {
	static int method1(int data) {
		try {
			return 30 / data;
		} catch (Exception e) {
			System.out.println(e);
		}
		return 0;

	}

	static int method2(int data) {
		try {
			return 30 / data;
		} catch (Exception e) {
			System.out.println(e);
			return -1;
		}
		// return 0;

	}

//finalyy block overides any return values from try and catch block
	@SuppressWarnings("finally")
	static int method3(int data) {
		try {
			return 30 / data;
		} catch (Exception e) {
			System.out.println(e);
			return -1;
		}

		finally {
			return 0;
		}

	}

//finalyy block overides 
	public static void main(String[] args) {

		System.out.println(method1(4));
		System.out.println(method1(0));
		System.out.println("==============");

		System.out.println(method2(4));
		System.out.println(method2(0));
		System.out.println("=============================");
		System.out.println(method3(4));
		System.out.println(method3(0));

	}

}
