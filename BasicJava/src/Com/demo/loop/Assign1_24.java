package Com.demo.loop;

import java.util.Scanner;

public class Assign1_24 {
	public static void Series(int n) {
		int i;
		long power=1;
		for(i=1;i<=n;i++) {
			//if(i%10==0)
			power=power*10+1;
		//power=	(long) Math.pow(10,i);
		
		System.out.println(power);
			
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		int n = sc.nextInt();
		Series(n);
		

	}

}
