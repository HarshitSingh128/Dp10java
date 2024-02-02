package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Quantity {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double bill,quantity;{
		System.out.println("Enter quantity=");
		}
		quantity=sc.nextDouble();
		if(quantity>50) {
			bill=100*quantity;
		System.out.println("final amount="+bill);
		
		}
		else if (quantity<50 && quantity>30) {
			bill=125*quantity;
			System.out.println("Final amount ="+bill);
		}
		else if(quantity<30) {
			bill=140*quantity;
			System.out.println("Final amount="+bill);
		}
			

	}

}
