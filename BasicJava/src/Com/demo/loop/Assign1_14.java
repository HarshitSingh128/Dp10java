package Com.demo.loop;

import java.util.Scanner;

public class Assign1_14 {
	public static void Power(int base, int index) {

		int i;
		for (i = base; i<= index;i++) {
			double power = Math.pow(base, index);
			System.out.println("the power is =" + power);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Base=");
		int base = sc.nextInt();
		System.out.println("Enter index=");
		int index = sc.nextInt();
		  Power(base,index);

	}
}
