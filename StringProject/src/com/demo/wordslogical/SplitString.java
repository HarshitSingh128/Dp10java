package com.demo.wordslogical;

import java.util.Arrays;

public class SplitString {
	static void divideString(String s,int noofC) {
		int len=s.length();
		int ns=len/noofC;
		if(len%noofC!=0) {
			System.out.println("canot divied in equal parts");
		}
		else {
			String splstr[]=new String[ns];
			int index=0;
			for(int i=0;i<s.length();i+=noofC) {
				splstr[index]=s.substring(i , i+noofC);
				index++;
			}
			System.out.println(Arrays.toString(splstr));
		}
	}
	static void addhash(String s,int noofC) {
		int len=s.length();
		if(len%noofC!=0) {
			//remaining character
			int x=noofC-(len%noofC);
			for(int i=0;i<x;i++) {
				s=s+"#";
				//s=s.conact("#");
			}
			
		}
		System.out.println(s);
//		 len=s.length();
//		int ns=len/noofC;
//		
//			String splstr[]=new String[ns];
//			int index=0;
//			for(int i=0;i<s.length();i+=noofC) {
//				splstr[index]=s.substring(i , i+noofC);
//				index++;
//			}
//			System.out.println(Arrays.toString(splstr));
		}
//	
	

	public static void main(String[] args) {
		String arr[]= {"I","am","very","smart"};
		System.out.println(Arrays.toString(arr));
		String st=String.join("", arr);
		int noofchars=3;
		divideString(st,noofchars);
		System.out.println("==========================");
		addhash(st,5);
	
	}

}
