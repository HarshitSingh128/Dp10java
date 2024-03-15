package com.demo.arraylistcrud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

//Create a class Movie with following data Members
//class Movie
//{
//private int movieId;
//private String movieName;
//private String movieRating;
//private Character c;
//}
//class Character
//{
//private int chracterId;
//private String chracterName;
//private String profile;
//}
//
//create a interface movieInfo showing all methods
//1) void addMovie();
//2) void updatMovie();
//3) void deleteMovie();
//4) void searchMovie();
//5) List<Movie>  showMovies();
//6) List<Movie> sortMovieRating();(sort on basis of highest rating)
//
//create ArrayList<Movie> and show all its operations in implementing class
//
//create a Test class and run the code.

public class MovieInfo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Movie> a1 = new ArrayList<Movie>();
		int id;
		String name, ratings = null;
		int cid;
		String cname, cprofile;
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
				System.out.println("Add Movie");
				System.out.println("Enter the number of movie");
				int size = sc.nextInt();
				for (int i = 0; i < size; i++) {
					System.out.println("Enter Movie id:");
					id = sc.nextInt();
					System.out.println("Enter Movie Name:");
					name = sc.next();
					System.out.println("Enter Movie Ratings");
					ratings = sc.next();
					System.out.println("Enter Character id:");
					cid = sc.nextInt();
					System.out.println("Enter Character name:");
					cname = sc.next();
					System.out.println("Enter Character profile:");
					cprofile = sc.next();
					a1.add(new Movie(id, name, ratings, new Character(cid, cname, cprofile)));

				}
				break;
			case 2:
				System.out.println("Update Movie");

				System.out.println("Enter the Movieid you want to search ");
				id = sc.nextInt();
				boolean flag = false;
				ListIterator<Movie> ltr = a1.listIterator();
				while (ltr.hasNext()) {
					Movie m = ltr.next();
					if (m.getMovieId()== id) {
						System.out.println("Enter the name of Movie you want to update:");
						name = sc.next();
						ltr.set(new Movie(id, name, ratings, null));
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Id is not available:");
				} else {
					System.out.println("Updated SuccessFully");
				}

				break;
			case 3:
				System.out.println("Delete Movie");
				System.out.println("Enter the Movieid you want to Delete ");
				id = sc.nextInt();
				flag = false;
				Iterator<Movie> itr = a1.iterator();
				while (itr.hasNext()) {
					Movie m = itr.next();
					if (m.getMovieId() == id) {
						itr.remove();
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Id is not available:");
				} else {
					System.out.println("Deleted SccessFully:");
				}

				break;

			case 4:
				System.out.println("Search Movie");
				System.out.println("Enter the Movieid you want to search ");
				id = sc.nextInt();
				flag = false;
				itr = a1.iterator();
				while (itr.hasNext()) {
					Movie m = itr.next();
					if (m.getMovieId() == id) {
						System.out.println(m);
						flag = true;
					}
				}
				if (!flag) {
					System.out.println("Id is not available:");
				}

				break;

			case 5:
				System.out.println("Show all Movie:");
				itr = a1.iterator();
				while (itr.hasNext()) {
					Movie m = itr.next();
					System.out.println(m);
				}

				break;
			case 6:
				System.exit(0);

			}

		} while (true);

	}

}
