package Com.demo.method;

import java.util.Scanner;

public class Methodtest2 {
	public static void display(String name) {
		System.out.println("Name="+name);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		System.out.println("Enter name=");
		name=sc.next();
		display(name);
		
		

	}

}
