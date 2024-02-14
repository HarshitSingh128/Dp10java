package com.demo.stringbasic;

import java.util.Arrays;

//1>A word is alphabetically sorted if all of the letters in it are in consecutive alphabetical order. 
//* Some examples of alphabetically sorted words: 
//* abhors (a is before b, b is before h, h is before o, etc.), ghost, accent, hoop.
//Create a function that takes in a sentence as input and returns true if there is
//at least one alphabetically sorted word inside that has a minimum length of 3.
//
//foo("Paula has a French accent.") ➞ true
//"accent" is alphabetically sorted.
//
//foo("The biopsy returned negative results.") ➞ true
//"biopsy" is alphabetically sorted.

//foo("She sells sea shells by the sea shore.") ➞ false
////Although "by" is alphabetically sorted, it is only 2 letters long.
//
//*Do not count words with 2 or fewer characters.
//*Ignore punctuation (periods, commas, etc)
//
//* */

public class ExtraQuestion {
	static boolean sortLexo(String s) {
		String st[] = s.split("\\s");
		boolean flag = false;
		for (int i = 0; i < st.length; i++) {
			flag = true;
			if (st[i].length() > 3) {
				for (int j = 0; j < st[i].length(); j++) {
					for (int k = j + 1; k < st[i].length(); k++) {
						if (st[i].charAt(j) > st[i].charAt(k)) {
							flag = false;
							break;

						}
					}
				}

			} else {
				flag = false;
			}
			if (flag == true) {
				break;
			}

		}
		return flag;

	}

	public static void main(String[] args) {
		String s1 = "Paula has a French accent";
		String s2 = "The biopsy returned negative results";
		String s3 = "She sells sea shells by the sea shore";
		System.out.println(s1);
		System.out.println(sortLexo(s1));
		System.out.println(s2);
		System.out.println(sortLexo(s2));
		System.out.println(s3);
		System.out.println(sortLexo(s3));

	}

}
