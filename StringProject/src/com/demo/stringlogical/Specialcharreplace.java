package com.demo.stringlogical;

public class Specialcharreplace {
	public static String chartest(String s) {
		char c[]=s.toCharArray();
	
		for(int i=0;i<c.length;i++) {
			if(c[i]=='A'||c[i]=='I'||c[i]=='E'||c[i]=='O'||c[i]=='U'||c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u') {
		                    c[i]='$';
			}
		}
	String s1=new String(c);
	return s1;
	}
	public static void main(String[] args) {
		String str="Java is programming language";
		
		System.out.println(str);
		System.out.println(chartest(str));
		

	}

}
