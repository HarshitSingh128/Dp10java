package com.demo.arrraylistdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionArrayConversion {

	public static void main(String[] args) {
	//convert an array to arraylist
		String lang[]= {"java","C","Python","Angular"};
		//1st way
		List<String> a1=Arrays.asList(lang);
		System.out.println(a1);
		
		//2nd way
		ArrayList<String> list=new ArrayList<>(Arrays.asList(lang));
		System.out.println(list);
		
		//3rd way
		ArrayList<String> al2=new ArrayList<>();
		Collections.addAll(al2, lang);
		System.out.println(al2);
		
		//arraylist to array
		//not type safe
		Object[] arr=list.toArray();
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			arr[i]=((String)arr[i]).toUpperCase();
			
		}
		System.out.println(Arrays.toString(arr));
		//type safe
		String str[]=new String [list.size()];
		list.toArray();
		for(int i=0;i<str.length;i++) {
			str[i]=str[i].toLowerCase();
			
		}
		System.out.println(Arrays.toString(str));

	}

}
