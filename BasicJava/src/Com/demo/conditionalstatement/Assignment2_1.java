package Com.demo.conditionalstatement;

import java.util.*;

public class Assignment2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year=");
		int rem, year;
		year = sc.nextInt();
		rem = year % 4;
		if (rem == 0) {
			System.out.println("year is leapyear=");
		} else

			System.out.println("year is not a leapyear");
	}

}
