package Com.demo.method;

import java.util.Scanner;

public class MathTest {
	public static int findSquare(int num) {
		return num * num;
	}

	public static int findcube(int num) {
		return num * num * num;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter number =");
		num = sc.nextInt();
		int s = findSquare(num);
		System.out.println("Square is=" + s);
		int q = findcube(num);
		System.out.println("cube is =" + q);

	}

}
