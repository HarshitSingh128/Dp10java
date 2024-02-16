package com.demo.exceptionbasic;

import java.util.Scanner;

class User {
	static void numtest() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num = sc.nextInt();
		try {
			if (num >=9999) {
				throw new RuntimeException("Number in between 1 to 9999");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}

public class Userdefineexception {
	public static void main(String[] args) {
		//User u1=new User();
		User.numtest();
	}

}
