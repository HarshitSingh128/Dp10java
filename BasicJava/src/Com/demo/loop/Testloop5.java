package Com.demo.loop;

import java.util.Scanner;

public class Testloop5 {
	public static void Oddnumber() {
		int i;

		for (i = 1; i <= 50; i++) {
			if (i % 2 != 0) {
				System.out.println("Number is odd=");
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		Oddnumber();

	}

}
