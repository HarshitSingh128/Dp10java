package com.demo.stringlogical;

public class CountDigitsString {
	static int findCount(String s) {
		int count=0;
		char ch[]=s.toCharArray();
		for(char c:ch) {
			if(c>=48 && c<=57) {
				count++;
			}
		}
		return count++;
	}
static int findcount2(String s) {
	int count=0;
	for(int i=0;i<s.length();i++) {
		if(Character.isDigit(s.charAt(i))) {
			count++;
		}
	}
	return count;
}
	public static void main(String[] args) {
		String s1="Java1205prog12ming";
		System.out.println(s1);
		System.out.println("Digit is:"+findCount(s1));
		
		System.out.println("---------------------------------------------------");
		System.out.println(s1);
		System.out.println("Digit is : "+findcount2(s1));
		
		

	}

}
