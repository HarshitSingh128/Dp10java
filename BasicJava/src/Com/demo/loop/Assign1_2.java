package Com.demo.loop;

import java.util.Scanner;

public class Assign1_2 {
	public static void Oddnumber() {
		int i = 521;

		while (i >= 229) {
			if (i % 2 != 0) {

				System.out.println(i);

			}

			i--;
		}
		System.out.println("Odd number=");

	}

	public static void main(String[] args) {
		Oddnumber();

	}

}
//	 WAP to print odd numbers from 521 to 229 using while loop. 
