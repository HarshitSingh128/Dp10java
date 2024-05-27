package com.demo.practic;

public class ExceptionDemo {
	static void exception(String s[]){
		try{
		for(int i=0;i<s.length;i++){
		if(s[i].length()<3){
		throw new ExceptionLength("Name should be greater than 3:");
		}
		System.out.println("Welcome"+s[i]);
		}
		}
		catch(ExceptionLength e){
		System.out.println(e);
		}
		}
		public static void main(String args[]){
		String s1[]={"Rupesh","Rakesh","al"};
		exception(s1);
		}
	
		}
		

