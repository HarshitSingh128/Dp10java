package com.demo.practic;

public class Blankspaces {
	static void usingreplace(String s){
		s=s.replace("  "," ");
		System.out.println(s);
		}
//		static void balanktest(String s){
//		String st[]=s.split(" ");
//		for(int i=0;i<st.length();i++){
//		if(st=="  " || st=='.'){
//		st=" ";
//		}
//		}
//		System.out.println(st);
//		}
		public static void main(String args[]){
		String s1="i  like  java  prpgramming";
		//balanktest(s1);
		usingreplace(s1);
		}
}
