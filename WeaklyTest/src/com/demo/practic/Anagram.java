package com.demo.practic;

public class Anagram {
	static void sortArray(char ch[]){
		for(int i=0;i<ch.length;i++){
		for(int j=i+1;j<ch.length;j++){
		if(ch[i]>ch[j]){
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		}
		}
		}
		}
		static boolean checkAnagram(String s1,String s2){
		if(s1.length()!=s2.length()){
		return false;
		}
		else {
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		sortArray(c1);
		sortArray(c2);
		for(int i=0;i<c1.length;i++){
		if(c1[i]!=c2[i]){
		return false;
		}
		}
		return true;
		}
		}
		public static void main(String args[]){
		String s1="Race";
		String s2="race";
		if(checkAnagram(s1,s2)){
		System.out.println("Anagram");
		}
		else {
		System.out.println("Not anagram");
		}
	}
}

