package com.demo.string;
//6. WAP to split string into 2 tokens where string is “HELLO$WORLD”
public class Splitaddspecilachar {
	static void splitString(String s) {
		String st[]=s.split("\\$");
		String str="";
		for(int i=0;i<st.length;i++) {
			str=str+st[i]+" ";
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		String s1="HELLO$WORLD";
		splitString(s1);
	}

}
