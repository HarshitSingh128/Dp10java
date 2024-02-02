package Com.demo.conditionalstatement;

import java.util.Scanner;

public class VolumeSphere {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius=");
		int r=sc.nextInt();
		 double volume=4/3*(3.14*r*r*r);
		System.out.println("Volume of sphere=" +volume);

	}

}
