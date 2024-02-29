package com.demo.arraylistcrud;

import java.util.Scanner;

public class MovieImplements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MovieDemo m1 = new MovieDemo();
		do {
			System.out.println("1.Add Movie");
			System.out.println("2.Update Movie");
			System.out.println("3.Delete Movie");
			System.out.println("4.Search Movie");
			System.out.println("5.show All Movie ");
			System.out.println("6.Exit");

			System.out.println("Enter choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				m1.addMovie();
				break;
			case 2:
				m1.updateMovie();
				break;
			case 3:
				m1.deleteMovie();
				break;
			case 4:
				m1.searchMovie();
				break;
			case 5:
				m1.showallMovie();
				break;
			case 6:
				m1.exit();
				break;
			default:
				System.out.println("You have enter invalid choice");
			}
		} while (true);
	}

}
