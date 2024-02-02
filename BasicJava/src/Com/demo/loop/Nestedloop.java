package Com.demo.loop;

import java.util.Scanner;

public class Nestedloop {
	public static void printFact(int num) {
		int i,j,fact;
		for(i=1;i<=num;i++) {
			fact=1;
			for(j=1;j<=i;j++) {
				fact=fact*j;
			}
			System.out.println(i+"!="+fact);
			
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		int num = sc.nextInt();
		printFact(num);

	}

}
