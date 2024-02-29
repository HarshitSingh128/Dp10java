package com.demo.arraylistcrud;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public interface MovieInterface {
	void addMovie();

	void updateMovie();

	void deleteMovie();

	void searchMovie();

	void showallMovie();

	void exit();

}

class MovieDemo implements MovieInterface {
	Scanner sc = new Scanner(System.in);
	ArrayList<Movie> a1 = new ArrayList<Movie>();
	int id;
	String name, ratings;
	int cid;
	String cname, cprofile;
	boolean flag;

	@Override
	public void addMovie() {
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

	}

	@Override
	public void updateMovie() {
		System.out.println("Update Movie");

		System.out.println("Enter the Movieid you want to search ");
		id = sc.nextInt();
		flag = false;
		ListIterator<Movie> ltr = a1.listIterator();
		while (ltr.hasNext()) {
			Movie m = ltr.next();
			if (a1.MovieId == id) {
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

	}

	@Override
	public void deleteMovie() {
		System.out.println("Delete Movie");
		System.out.println("Enter the Movieid you want to Delete ");
		id = sc.nextInt();
		flag = false;
		Iterator<Movie> itr = a1.iterator();
		while (itr.hasNext()) {
			Movie m = itr.next();
			if (a1.MovieId == id) {
				itr.remove();
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("Id is not available:");
		} else {
			System.out.println("Deleted SccessFully:");
		}

	}

	@Override
	public void searchMovie() {
		System.out.println("Search Movie");
		System.out.println("Enter the Movieid you want to search ");
		id = sc.nextInt();
		flag = false;
		Iterator<Movie> itr = a1.iterator();
		while (itr.hasNext()) {
			Movie m = itr.next();
			if (a1.MovieId == id) {
				System.out.println(m);
				flag = true;
			}
		}
		if (!flag) {
			System.out.println("Id is not available:");
		}

	}

	@Override
	public void showallMovie() {
		System.out.println("Show all Movie:");
		Iterator<Movie> itr = a1.iterator();
		while (itr.hasNext()) {
			Movie m = itr.next();
			System.out.println(m);
		}

	}

	@Override
	public void exit() {
		System.exit(0);
	}

}
