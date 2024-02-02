package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Assignment2_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int u;
		double totalbill;
		System.out.println("Enter unit=");
		u=sc.nextInt();
		if(u==50) {
			totalbill=0.50*u+0.2;
			System.out.println("total bill ="+totalbill);
		}
		 else if (u>50 && u<150) {
			 totalbill=0.75*u+0.2;
			 System.out.println("totalbill="+totalbill);
		 }
		 else if(u>150 && u<250) {
			 totalbill=1.25*u+0.2;
			 System.out.println("totalbill is ="+totalbill);}
		 else if (u>250) {
			 totalbill=1.50*u+0.2;
			 System.out.println("totalbill ia ="+totalbill);
		 }
		 else  {
			 System.out.println("totalbill is not defind=");
		 }
		 }
			
		}
			

	


