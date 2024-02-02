package Com.demo.Switch1;

import java.util.Scanner;

public class Doubleswitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		String veg;
		int choice;
		System.out.println("Welcome to my shop=");
		System.out.println("1.capcicum\n2'patato=");
		System.out.println("Enter choice=");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:System.out.println("Enter the colour of capcicum");
		String colour=sc.next();
		switch(colour) {
		case "red":
			System.out.println("Red capcicum=");
			break;
		case "green":
			System.out.println("Green capcicum=");
			break;
			default:
				System.out.println("not capcicum=");
		}
		
		
		}
		

	}

}
