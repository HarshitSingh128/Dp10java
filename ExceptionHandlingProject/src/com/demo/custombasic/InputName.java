package com.demo.custombasic;

import java.util.Scanner;

public class InputName {

	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
		
		try
		{
			System.out.println("Enter name");
			String name=sc.next();
			if(name.length()<3)
				throw new InvalidNameException("Number of characters should be greater than 2");
			
			System.out.println("welcome "+name);
			
		}
		catch(InvalidNameException e)
		{
			System.out.println(e);
		}
		finally {
			sc.close();
		}

	}

}
