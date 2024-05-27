package Weaklydemo;
import java.util.Scanner;

public class TwinPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n1");
		int n1 = sc.nextInt();
		System.out.println("Enter n2");
		int n2 = sc.nextInt();
		int count1 = 0;
		int count2 = 0;
		int i;
		int d;
		for (i = 1; i <= n1; i++) {
			if (n1 % i == 0) 
				count1++;
			
		}
		for (i = 1; i <= n2; i++) {
			if (n2 % i == 0) 
				count2++;

			
		}
		d = Math.abs(n1-n2);
		if (d==2 && count1 == 2 && count2==2) 
			System.out.println("Twin prime");
		
		else 
			System.out.println("Not twin prime");
		
	}

}
