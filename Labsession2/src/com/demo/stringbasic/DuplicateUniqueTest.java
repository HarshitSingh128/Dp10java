package com.demo.stringbasic;
//1. WAP to find the duplicate and unique words in a string
public class DuplicateUniqueTest {
	public static void duplicateTest(String st) {
		String s[]=st.split(" ");
		int count;
		boolean flag=false;
		for(int i=0;i<s.length;i++) {
			count=1;
			flag=false;
			for(int j=i-1;j>=0;j++) {
				if(s[i].equalsIgnoreCase(s[j])){
					flag=true;
					break;
					
				}
			}
			if(flag==false) {
				for(int k=i+1;k<s.length;k++) {
					if(s[i].equalsIgnoreCase(s[k])) {
						count++;
					}
				}
				if(count>1) {
					System.out.println("Duplicate is :"+s[i]);
				}
				else if(count==1) {
					System.out.println("Unique is:"+s[i]);
					
				}
			}
		}
	}

	public static void main(String[] args) {
		String str="java is fun and is a java intersting";
		System.out.println(str);
		duplicateTest(str);
	//System.out.println(str);
		
	}

}
