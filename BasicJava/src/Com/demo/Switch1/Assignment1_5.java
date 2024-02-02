package Com.demo.Switch1;

import java.util.Scanner;

public class Assignment1_5 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int weaknumber;
			System.out.println("Enter weak number=");
			weaknumber=sc.nextInt();
			switch(weaknumber) {
			case 1 :
				System.out.println("Day is sunday=");
				break;
			case 2:
				System.out.println("Day is monday=");
				break;
			case 3:
				System.out.println("Day is tuesday=");
				break;
			case 4:
				System.out.println("day is wednesday=");
				break;
			case 5:
				System.out.println("Day is thrusday=");
				break;
			case 6:
				System.out.println("day is Friday=");
				break;
			case 7:
				System.out.println("Day is saturday=");
				break;
				default:
					System.out.println("Day does not in a week=");
					
			}
	}
}