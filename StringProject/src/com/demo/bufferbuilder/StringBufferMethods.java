package com.demo.bufferbuilder;

public class StringBufferMethods {

	public static void main(String[] args) {
		//no concat method
		StringBuffer sb=new StringBuffer();
		sb.append("Programs");
		sb.reverse();
		System.out.println(sb);
				
		String s="java is fun";
		StringBuilder sb1=new  StringBuilder(s);
		sb1.reverse();
		System.out.println(sb1);
		
		sb.reverse();
		System.out.println(sb);
		
		sb.replace(2 , 5, "java");//2,3,4-index
		System.out.println(sb);
		
		sb.insert(1, "code");
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println(sb.charAt(2));
		
		sb.delete(1, 3);
		System.out.println(sb);
		sb.deleteCharAt(sb.length()-1);
		System.out.println(sb);
		
		System.out.println(sb.indexOf("java"));
		
		sb.setCharAt(1, 'p');
		System.out.println(sb);
	}

}
