package Com.demo.loop;

import java.util.Scanner;

public class DEmo_while {
	public static void printno(int n) {
		int i=1;
		while(i<=n) {
			System.out.println(i);
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter n=");
		n = sc.nextInt();
		printno(n);
		

	}

}
