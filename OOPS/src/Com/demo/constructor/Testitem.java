package Com.demo.constructor;

import java.util.Scanner;

public class Testitem {
	static Scanner sc = new Scanner(System.in);

	public static void enterItemDetails(Item i) {
		System.out.println("Enter Item id:");
		i.setItemid(sc.nextInt());
		System.out.println("Enter Item name:");
		i.setItemname(sc.next());
		System.out.println("Enter Item cost:");
		i.setItemcost(sc.nextInt());
		System.out.println("Enter the Quantity:");
		i.setItemqty(sc.nextInt());
	}

	public static void main(String[] args) {
		Item i1 = new Item();
		enterItemDetails(i1);
		Item i2 = new Item();
		enterItemDetails(i2);
		System.out.println("--------");
		System.out.println(i1);

		System.out.println("Amount to pay:" + i1.calDiscountPrice(10));
		System.out.println(i2);
		System.out.println("Amount to pay:" + i2.calDiscountPrice(20));
		i1.compairCoast(i2);

	}

}
