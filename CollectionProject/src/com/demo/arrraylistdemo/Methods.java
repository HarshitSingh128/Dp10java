package com.demo.arrraylistdemo;

import java.util.ArrayList;
import java.util.List;

public class Methods {

	public static void main(String[] args) {
		List<String> a1=new ArrayList<>();
		
		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
            
		
		a1.add("Shreyash");
		a1.add("Akshata");
		a1.add("Mandar");
		a1.add("Gunjan");
		

		System.out.println(a1.size());
		System.out.println(a1.isEmpty());
		
		System.out.println(a1);
		
	 a1.add(1, "Harshit");
	 System.out.println(a1);
	 System.out.println(a1.set(2, "Onkar"));
	 System.out.println(a1);
	 
//	 System.out.println(a1.set(5, "Amruta"));
//	 System.out.println(a1);
	 //contains
	 System.out.println(a1.contains("Onkar"));
	 System.out.println(a1.contains("Pravin"));
	 
	 System.out.println("--------------------");
	 System.out.println(a1.remove("Onkar"));
	 System.out.println(a1);
	 System.out.println("--------------------");
	 
	 System.out.println(a1.remove("Anita"));
	 System.out.println(a1);
	 
	 System.out.println("---------------------");
	 System.out.println(a1.remove(1));
	 System.out.println(a1);
	 
	 System.out.println("-----------------------");
	 System.out.println(a1.add("pradnya"));
	 System.out.println(a1);
	//System.out.println(a1.add(3,"Supriya"));//we cannot write in sysout part because its return type void
	 
	 
	 a1.add(3, "Supriya");
	 System.out.println(a1);
	 
	 
	}

}
