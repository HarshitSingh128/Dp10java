package com.demo.string;

public class IntegerInString {
	public static void findSum(String s) {
		int sum=0;
		char arr[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			if(Character.isDigit(arr[i])) {
				int x=Character.getNumericValue(arr[i]);
				sum=sum+x;
			}
		}
		System.out.println("Sum is :"+sum);
	}
	static void findsumlogic(String s) {
		int sum=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=48 && ch[i]<=57) {
				int x=ch[i]-48;
				sum=sum+x;
			}
		}
		System.out.println("Sum is :"+sum);
	}
	static void findaverage(String s) {
		int sum=0;
		int count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>=48 && ch[i]<=57) {
				int x=ch[i]-48;
				sum=sum+x;
				count++;
			}
		}
		System.out.println("Average is :"+sum/count);
	}

	public static void main(String[] args) {
		String s="Sachin scores 789 runs in test match";
		findSum(s);
		findsumlogic(s);
		findaverage(s);
	}

}
