package com.demo.arrraylistdemo;

import java.util.ArrayList;

public class Reversearraylist {
	int index;
	static void reversetest(ArrayList<String> al) {
		for(int i=0,j=al.size()-1;i<al.size()/2;i++,j--) {

			String temp = al.get(i);
			al.set(i, al.get(j));
			al.set(j, temp);
		}
			
		}
		
	

	public static void main(String[] args) {
		ArrayList<String> i1= new ArrayList<>();
		i1.add("Shreyash");
		i1.add("Harshit");
		i1.add("Suresh");
		i1.add("Laxmi");
		
		System.out.println("Before :"+i1);
		reversetest(i1);
		System.out.println("After:"+i1);
		

	}

}
