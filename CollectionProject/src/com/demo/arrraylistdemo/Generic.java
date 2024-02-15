package com.demo.arrraylistdemo;

import java.util.ArrayList;

public class Generic {

	public static void main(String[] args) {
		ArrayList <Integer>list=new ArrayList<>();
		list.add(12);//capacity:10
		list.add(56);
		list.add(78);
		list.add(89);
		
		System.out.println(list);
		
		System.out.println("____________________");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			int data=list.get(i)+10;
			list.set(i, data);
		}
System.out.println("=============================");
		
		System.out.println(list);
		

	}

}
