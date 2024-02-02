package practiceonly;

import java.util.Scanner;

public class Primenub {
	int num;
	public Primenub(int num) {
		int i;
		int count=0;
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
				count++;
			
			}
		}
		if(count==2) {
			System.out.println("Prime nub");
		}
		else 
		{ 
			System.out.println("Not prime nub");
		}
			
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int num=sc.nextInt();
		Primenub p1=new Primenub(num);
	//  p1.Primenum(num);
		
	

	}

}
