package com.demo.arraylistcrud;

import java.util.ArrayList;

public class MovieInfo {

	public static void main(String[] args) {
		ArrayList<Movie> a1=new ArrayList<>();
		a1.add(new Movie(101, "RRR", "Single", new Character(102, "Salman", "Hero")));
		a1.add(new Movie(104, "WAR", "Double", new Character(111, "Sharukh", "Hero")));
		
		for(Movie m:a1) {
			System.out.println(m);
		}
	}

}
