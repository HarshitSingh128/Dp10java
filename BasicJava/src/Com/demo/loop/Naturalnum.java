package Com.demo.loop;

import java.util.Scanner;

public class Naturalnum {
	public static void Natural(int n) {
		int i;
		int sum=0;
		for (i=1;i<=n;i++) {
			sum=sum+i;
			
			

		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n=");
		n=sc.nextInt();
		Natural(n);
		

	}

}
