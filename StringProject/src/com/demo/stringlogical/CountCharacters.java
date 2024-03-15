package com.demo.stringlogical;

public class CountCharacters {
	static int findnochars(String s) {
		int count = 0;
		char ch[] = s.toCharArray();
//		for (char c : ch) {
//			count++;
//		}
	for(int i=0;i<ch.length;i++) {
		count++;
		}
		return count;
	}

	static void findVowelsConsonants(String s) {
		int vcount = 0;// for vowel
		int ccount = 0;//for consonants
		s = s.toUpperCase();
		char ch[] = s.toCharArray();
		for (char c : ch) {
			// omit spaces and .
			if (c == ' ' || c == '.')
				continue;
			if (c == 'A' || c == 'E' || c == 'I' || c == 'O' | c == 'U') {
				vcount++;
			} else {
				ccount++;
			}
			
		}
		System.out.println("Number of vowels:" + vcount);
		System.out.println("Number of consonents: " + ccount);


	}

	public static void main(String[] args) {
		String str= "Programming is fun.Java is fun";
				
				//System.out.println(str);
				System.out.println(findnochars(str));
				 findVowelsConsonants(str);
		

	}

}
