package com.demo.basicdemo2;

import java.io.IOException;

public class ThrowsDemo2 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//throw new ArithmeticException("not a value");
				try
				{
				
				throw new IOException("Invalid input");
				}
				catch (Exception e) {
					System.out.println(e);
				}
	}

}
