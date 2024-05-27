package com.demo.test;

import java.util.Arrays;

public class PracticeString {

	static void stringdemo(String s) {

		if (s.length() < 3) {
			try {
				throw new Exception("Invalid sentance Exception");
			} catch (Exception e) {
				System.out.println(e);
			}

		}
		else {
			String[] st=s.split(" ");
			String rev1="";
		//	System.out.println(Arrays.toString(st));
			for(int i=0;i<st.length;i++) {
					String rev=st[i].substring(0, 1).toUpperCase();
					System.out.println(rev);
			}
		
        //String rev = st.substring(0, 1).toUpperCase() + s.substring(1);
        // System.out.println(rev);
		}
	}

	public static void main(String[] args) {
		String str = "i love my country india";
		stringdemo(str);
		// String s="i";
		// stringdemo(s);

	}

}
