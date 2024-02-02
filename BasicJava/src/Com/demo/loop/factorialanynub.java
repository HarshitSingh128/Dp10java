package Com.demo.loop;

import java.util.Scanner;

public class factorialanynub {
	public static void factorial(int n) {
		int i ;
		int fact=1;
		for (i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n=");
		n=sc.nextInt();
		factorial(n);
		

	}

}
