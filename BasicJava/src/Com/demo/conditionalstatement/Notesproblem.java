package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Notesproblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 int amount, n500=0,n200=0,n100=0,n50=0,n20=0,n10=0;
		System.out.println("enter amount=");
		amount=sc.nextInt();
		if(amount>=500) {
			n500=amount/500;
			amount=amount%500;
		}
		if (amount>=200){
			n200=amount/200;
			amount=amount%200;
		}
		if (amount>=100){
			n100=amount/100;
			amount=amount%100;
		}
		if(amount>=50) {
			n50=amount/50;
			amount=amount%50;
		}
		if(amount>=20) {
			n20=amount/20;
			amount=amount%20;
		}
		if(amount>=10) {
			n10=amount/10;
			amount=amount%10;
			}
		System.out.println("Notes of 500="+n500);
		System.out.println("Notes of 200="+n200);
		System.out.println("Notes of 100="+n100);
		System.out.println("notes of 50="+n50);
		System.out.println("Notes of 20="+n20);
		System.out.println("Notes of 10="+n10);
		}
		}


