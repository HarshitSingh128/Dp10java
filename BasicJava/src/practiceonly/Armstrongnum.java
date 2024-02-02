package practiceonly;

import java.util.Scanner;
// wAp to check num is armstrong or not ??
public class Armstrongnum {
	int num;
	public  Armstrongnum(int num) {
		this.num=num;
		int rem;
		int sum=0;
		int temp=num;
		while (num>0) {
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num/=10;
		}
		if(sum==temp){
			System.out.println("Armstrong num");
		}
		else
		System.out.println("Not Armstrong");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		Armstrongnum a1=new Armstrongnum(num);
		//checkarmstrong(num);
		

	}

}
