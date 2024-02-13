package com.demo.stringbasic;

//5.Write a Java program to remove all extra blank spaces from a given string.
public class MethodsStringtest {
	public static void removespace(String s) {
		// s=s.trim();
		// System.out.println(s);
		s = s.replace(" ", "");
		System.out.println(s);
	}
	//7.Write a Java program to find reverse of a string.
	static void findReverse(String st) {
		String revst="";
		for(int i=(st.length()-1);i>=0;i--) {
			revst=revst+st.charAt(i);
		}
		System.out.println(revst);
	}
	//8.Write a Java program to find highest frequency character in a string.
	static void findFrequency(String st) {
		String []s=st.split("\\s");
		int count;
		boolean flag;
		for(int i=0;i<s.length;i++) {
			count=1;
			flag=false;
			for(int j=i-1;j>=0;j--) {
				if(s[i].equalsIgnoreCase(s[j])) {
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
				if(count==2) {
				System.out.println(s[i]+": "+"Frequency is"+"<"+count);
				}
			
			}
		}
	}


	public static void main(String[] args) {
		String s1 = "  java is fun";
		String str="A big cat is rolling on a big mat";
		removespace(s1);
		findReverse(s1);
		findFrequency(str);

	}

}
