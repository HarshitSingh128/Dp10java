package practiceonly;

import java.util.Scanner;

public class series {
	public static void ser (int num) {
		int i;
		int sum=1;
		for(i=0;i<=num;i++) {
			sum=sum+i;
			
			System.out.println(sum);
			
		}
		
	}
	public static void dv(int num) {
		int i;
		int sum=1;
		for(i=1;i<=num;i++) {
			sum=i*i;
			System.out.println(sum);
			
		}
	}
	public static void cd(int num) {
		int i;
		int sum=1;
		for(i=1;i<=num;i++) {
			if(i%2!=0) {
				sum=i+i;
				System.out.println(sum);
			}
			else {
				sum=-i-i;
				System.out.println(sum);
			}
				
		}
	}
	public static void sdf(int num) {
		int i;
		int power=1;
		for(i=1;i<=num;i++) {
			power=power*10+1;
			System.out.println(power);
		}
	}
	public static void sdfg(int num) {
		int rem;
		int product=1;
		while(num>0) {
			rem=num%10;
			num/=10;
			product=product*rem;
			
		}
		System.out.println(product);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter nub=");
		int num=sc.nextInt();
		//ser(num);
		//dv(num);
		//cd(num);
		//sdfg(num);
		sdfg(num);
	}

}
