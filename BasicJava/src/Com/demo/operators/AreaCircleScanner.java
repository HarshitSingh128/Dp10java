package Com.demo.operators;

import java.util.Scanner;

public class AreaCircleScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius=");
		int r=sc.nextInt();
		double area=3.14*r*r;
		System.out.println("area of circle is ="+area);
		


	}

}
