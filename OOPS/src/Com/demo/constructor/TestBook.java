package Com.demo.constructor;

import java.util.Scanner;

public class TestBook {
	static Scanner sc = new Scanner(System.in);

	public static void enterBookDetails(Book b) {
		System.out.println("Enter Book id= ");
		b.setBookId(sc.nextInt());
		System.out.println("Enter Book name=");
		b.setBookName(sc.next());
		System.out.println("Enter Book price=");
		b.setBookPrice(sc.nextInt());
		System.out.println("Enter the  Quantity=");
		b.setBookqty(sc.nextInt());

	}

	public static void main(String[] args) {
		Book b1 = new Book();
		enterBookDetails(b1);
		Book b2 = new Book();
		enterBookDetails(b2);
		Book b3 = new Book();
		enterBookDetails(b3);
		Book b4 = new Book();
		enterBookDetails(b4);
		System.out.println(b1);
		System.out.println("Amount to pay:" + b1.calDiscountPrice(20));
		System.out.println(b2);
		System.out.println("Amount to pay:" + b2.calDiscountPrice(10));
		System.out.println(b3);
		System.out.println("Amount to pay:" + b3.calDiscountPrice(10));
		System.out.println(b4);
		System.out.println("Amount to pay:" + b4.calDiscountPrice(10));
		b2.compairCost(b1);

	}

}
