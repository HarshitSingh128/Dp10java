package com.demo.stringlogical;

import java.util.Arrays;

public class Anagram {
	static void sorArray(char ch[]) {
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					char temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;

				}
			}
		}
	}

	static boolean checkAnagram(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		} else {
			s1 = s1.toLowerCase();
			// System.out.println(s1);
			s2 = s2.toLowerCase();
			// System.out.println(s2);
			char c1[] = s1.toCharArray();
			// System.out.println(c1);
			char c2[] = s2.toCharArray();
			// System.out.println(c2);
			for (int i = 0; i < c1.length; i++) {
				if (c1[i] != c2[i]) {
					return false;

				}
			}
		}
		return true;
	}

	static boolean checkAnagram2(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}
		else {
			s1 = s1.toLowerCase();
			// System.out.println(s1);
			s2 = s2.toLowerCase();
			// System.out.println(s2);
			char c1[] = s1.toCharArray();
			// System.out.println(c1);
			char c2[] = s2.toCharArray();
			// System.out.println(c2);
			Arrays.sort(c1);
			Arrays.sort(c2);
			if (Arrays.equals(c1, c2))
				return true;
			else
				return false;

		}

	}

	public static void main(String[] args) {
		String str1 = "Race";
		String str2 = "race";
		
		System.out.println(str1);
		System.out.println(str2);
		if(checkAnagram(str1,str2)) {
			System.out.println("String are anagram");
		}
		else {
			System.out.println("Strings are not anagram");
		}

	}

}
