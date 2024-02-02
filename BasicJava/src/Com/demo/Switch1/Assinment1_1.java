package Com.demo.Switch1;

import java.util.Scanner;

public class Assinment1_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int month;
		System.out.println("Enter month number=");
		month=sc.nextInt();
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Number of days 31=");
			break;
		case 2:
			System.out.println("Number of days 29 or 28=");
			break;
			default :
				System.out.println("Number of days 30=");
		
		
			
			
		}
		}
				

	}


