package Com.demo.Switch1;

import java.util.Scanner;

public class Assignment1_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number b/w 1 to 5=");
		int num=sc.nextInt();
		switch(num) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
			default:
				System.out.println("Number is not b/w 1 to 5");
		}
	}

}
