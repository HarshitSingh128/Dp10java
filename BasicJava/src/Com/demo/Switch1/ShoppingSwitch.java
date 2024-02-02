package Com.demo.Switch1;

import java.util.Scanner;

public class ShoppingSwitch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choose = 0;
		System.out.println("Welcome E-commerce App=");
		System.out.println("1.Men\n2.Women\n3.Kids=");
		System.out.println("choose=");
		choose=sc.nextInt();
		switch(choose) {
		case 1:System.out.println("1.footwear\n2.Tshirt=");
		break;
		case 2: System.out.println("1.Jewellery\n2.saree=");
		break;
		case 3:System.out.println("1.Toys \n2.Educationalgame");
		break;
		default :
			System.out.println("U cant buy anything=");
		
		
		}

	}

}
