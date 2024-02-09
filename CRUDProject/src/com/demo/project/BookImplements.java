package com.demo.project;

import java.util.Scanner;

public class BookImplements {

	public static void main(String[] args) {
		BookInfo b1=new BookInfo();
		Scanner sc = new Scanner(System.in);
//		Book b[] = new Book[5];
//		int id, price;
//		String bname, aname;
//		int count = 0;
		do {
			System.out.println("1.Add Book");
			System.out.println("2.Update Book");
			System.out.println("3.Delete Book");
			System.out.println("4.Search Book");
			System.out.println("5.show All Books ");
			System.out.println("6.Exit");

			System.out.println("Enter choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				b1.addbook();
				break;
			case 2:
				b1.updateBook();
				break;
			case 3:
				b1.deleteBook();
				break;
			case 4:
				b1.searchBook();
				break;
			case 5:
				b1.showallBook();
				break;
			case 6:
				b1.exit();
				break;
				default :
					System.out.println("You have enter invalid choice");
			}
		}while(true);
	}

}
