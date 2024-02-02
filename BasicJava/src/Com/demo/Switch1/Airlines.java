package Com.demo.Switch1;

import java.util.Scanner;

public class Airlines {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		double amount;
		System.out.println("Enter yor name=");
		name=sc.next();
		System.out.println("Welcome to Airlines=");
		System.out.println("1.Lufthansa\n2.airarabia\n3.Indogo=");
		System.out.println("Enter your choice=");
		int choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter your boarding place=");
		String Bp=sc.next();
		System.out.println("Enter your destination place=");
		String Des=sc.next();
		amount=20000;
		System.out.println("Your amount will be 20000=");
		System.out.println("Do you have coupon=");
	     int coupon=sc.nextInt();
		if(coupon==1)
		System.out.println("Discount offer is 25% on amount=");
		amount=amount-(amount*0.25);
		
		System.out.println("Total amount is ="+amount);
		System.out.println("Your ticket is booked from "+Bp+" to "+Des);
		break;
		case 2: System.out.println("Enter your boarding place=");
		String Bp1=sc.next();
		System.out.println("Enter your destination place=");
		String Des1=sc.next();
		amount=15000;
		System.out.println("Your amount will be 15000=");
		System.out.println("Do you have coupon=");
	     int coupon1=sc.nextInt();
	     if(coupon1==2) {System.out.println("Discount offer is 25% on amount=");
			amount=amount-(amount*0.25);
			System.out.println("Total amount is ="+amount);
			System.out.println("Your ticket is booked from "+Bp1+" to "+Des1);
	     }
			
		break;
	    	 
	     
		case 3:
			System.out.println("Enter your boarding place=");
		
		String Bp11=sc.next();
		System.out.println("Enter your destination place=");
		String Des11=sc.next();
		amount=10000;
		System.out.println("Your amount will be 10000=");
		System.out.println("Do you have coupon=");
	     int coupon11=sc.nextInt();
	     if(coupon11==3) {System.out.println("Discount offer is 25% on amount=");
			amount=amount-(amount*0.25);
			
			System.out.println("Total amount is ="+amount);
			System.out.println("Your ticket is booked from "+Bp11+" to "+Des11);
			break;
	     } 
		

		}
	}
}
		
		

	


