package com.dmo.basicstring;

public class Stringmethods {

	public static void main(String[] args) {
		
		String str="java is fun.";
		System.out.println(str.length());//12
		
		//charAt
		System.out.println(str.charAt(1));//a
		
		System.out.println(str.charAt(str.length()-1));//.
		
		//concat , +
		String s1="Hello";
		String s2="World";
		//2 different object will be created "helloWorld" in heap only
		
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		// substring 
		
		System.out.println(str.substring(1));//print from 1 till length
		System.out.println(str.substring(1, 6));//print form 1 to 5
		
		//contains
		System.out.println(str.contains("ava"));
		System.out.println(str.contains("orl"));
		
		String w1="hi";
		String w2="Hi";
		System.out.println(w1==w2);//false //it includes case 
		System.out.println(w1.equals(w2));//it include case //false
		
		System.out.println(w1.equalsIgnoreCase(w2));// it is  not contains case
		//upper case 
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		//indexof,lastIndexof
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		
		System.out.println(str.indexOf("fun"));
		
		//is Empty
		String st="  ";
		System.out.println(st.isBlank());//true
		System.out.println(st.isEmpty());//false
		
		//trim
		String sr=" java  ";
		System.out.println(sr+sr.length());
		sr=sr.trim();
		System.out.println(sr+ sr.length());//it contains space before and after
		
		System.out.println(sr);
		System.out.println(sr.replace('a', 'z'));
		

	}

}
