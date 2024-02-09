package com.demo.stringlogical;

import java.util.Arrays;

public class StringSorting {
	static void sort(String st[]) {
		for(int i=0;i<st.length;i++) {
			for(int j=i+1;j<st.length;j++) {
				if(st[i].length()>st[j].length()) {
					String temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
			}
		}
	}
	static void sortLexo(String st[]) {
		for(int i=0;i<st.length;i++) {
			for(int j=i+1;j<st.length;j++) {
				if(st[i].compareTo(st[j])>0) {
					String temp=st[i];
					st[i]=st[j];
					st[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		String s1[]= {"java" ,"c","paython","Angular"};
		System.out.println(Arrays.toString(s1));
	sort(s1);
	System.out.println("On the basis of length:"+Arrays.toString(s1));
		sortLexo(s1);
		System.out.println("on the basis of Dictionary format:"+Arrays.toString(s1));

	}

}
