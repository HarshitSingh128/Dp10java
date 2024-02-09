package com.demo.stringbasic;

//1.Write a Java program to find first occurrence of a character in a given string.
public class Stringoccurance {
	public static void firstOccurance(String s, char ch) {
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				System.out.println(ch + " at index :" + i);
				break;

			}
		}
	}

	// 1.Write a Java program to find middle occurrence of a character in a given
	// string.
	public static void middleoccurance(String s, char ch) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {

				if (s.charAt(i) == ch) {
					count++;
					if (count == 2) {
						System.out.println(ch + " at index :" + i);
						// System.out.println(count);
						break;
					}
				}

			}
		}

	}

	// 2.Write a Java program to count occurrences of a character in given string.
	public static void Occurance(String s, char ch) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				count++;

			}
		}
		// System.out.println("Occurancecount);
	}

	// 3.Write a Java program to count occurrences of all character in given string.
	public static void occurancesofallcharacter(String s) {
		char ch[] = s.toCharArray();
		int count;
		boolean flag;
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			flag = false;
			for (int j = i - 1; j >= 0; j--) {

				if (Character.isUpperCase(ch[i])) {
					ch[i] = (char) (ch[i] + 32);

					flag = true;
					break;
				}
			}
			if (flag == false) {
				for (int k = i + 1; k < ch.length; k++) {

					if (ch[i] == ch[k]) {
						count++;
					}

				}
				System.out.println(ch[i] + " " + "occurance is:" + "" + count);
//				if(count>1) {
//					System.out.println("Duplicate is::"+ch[i]);
//				}
			}
		}
	}

	public static void main(String[] args) {
		String s1 = "harshit";
		// firstOccurance(s1, 'a');
		// middleoccurance(s1,'h');
		Occurance(s1, 'h');

		occurancesofallcharacter(s1);

	}

}
