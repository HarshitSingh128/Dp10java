package com.demo.arrraylistdemo;

import java.util.ArrayList;
import java.util.Collections;

public class SortArraylist {
	static void sortList(ArrayList<Double> al) {
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(j) < al.get(i)) {

					double temp = al.get(i);
					al.set(i, al.get(j));
					al.set(j, temp);
				}
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Double> marks = new ArrayList<>();
		marks.add(90.5);
		marks.add(56.4);
		marks.add(56.4);
		marks.add(78.5);
		marks.add(100.0);
		marks.add(85.0);
		System.out.println("Before:"+marks);
		Collections.sort(marks);
		//sortList(marks);
		System.out.println("After:"+marks);
	}

}
