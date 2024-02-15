package com.demo.arrraylistdemo;

import java.util.ArrayList;

public class NonGeneric {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(12);
		list.add("Pravin");
		list.add(89.4f);
		list.add('A');
		
		System.out.println(list);
		
		System.out.println("____________________");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
			int data=(int)list.get(i)+10;
			list.set(i, data);
		}
		

	}

}
