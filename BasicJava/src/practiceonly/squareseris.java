package practiceonly;

import java.util.Scanner;

public class squareseris {
	public static void series(int num) {
		int i;
		int sum=1; 
		for(i=1;i<=num;i++) {
			sum=i*i;
			System.out.println(sum);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		series(num);

	}

}
