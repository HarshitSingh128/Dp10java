package Com.demo.Switch1;

import java.util.Scanner;

public class Demo_switch2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Welcome to my cafe=");
		System.out.println("1.Tea\n2.coffe\n3.cold drink=");
		System.out.println("enter choice=");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Tea is Rs 30=");
			break;
		case 2:
		System.out.println("Coffe is Rs 80=");
		break;
		case 3:
			System.out.println("Cold drink is Rs 20=");
			break;
			default :
				System.out.println("invalid choice=");
			
		}
		

	}

}
