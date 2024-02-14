package com.demo.basicdemo2;

import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) throws IOException, ArithmeticException {
		try {

			throw new ArithmeticException("not a value");
		} catch (Exception e) {
			System.out.println(e);
		}
		throw new IOException("Invalid input");

	}

}
