package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Extraassign9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double cp,sp,profit,loss;
		System.out.println("Enter selling price=");
		sp=sc.nextDouble();
		System.out.println("Enter cost price=");
		cp=sc.nextDouble();
		profit=sp-cp;
		loss=cp-sp;
		if(profit>0) {
			System.out.println("Profit=");
		}
		else if (profit==0){
			System.out.println("No profit No loss=");
		}
		else
		
		{System.out.println("loss=");
		}

	}

}
