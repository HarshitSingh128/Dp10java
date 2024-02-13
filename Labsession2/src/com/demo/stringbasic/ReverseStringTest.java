package com.demo.stringbasic;

//. WAP to reverse the string word by word keepin first and last as it is 
public class ReverseStringTest {
	static void findReverse(String st) {
		String s[] = st.split(" ");

		String revst = "";
		revst = s[0] + " ";
		for (int i = 1; i < s.length - 1; i++) {
			for (int j = s[i].length() - 1; j >= 0; j--) {
				revst = revst + s[i].charAt(j);
			}
			revst = revst + " ";

		}
		System.out.println(revst + " " + s[s.length - 1]);

	}
	//4. WAP to make the first character of every word in a string as capital
	public static void startcapitalleter(String st) {
		String s[]=st.split(" ");
		for(int i=0;i<s.length;i++) {
			if(!s[i].isEmpty()) {
				s[i]=s[i].substring(0, 1).toUpperCase()+s[i].substring(1);
			}
		
		}
		System.out.println(String.join(" ", s));
		
	}

	public static void main(String[] args) {
		String str = "I Like java programming";
		System.out.println(str);
		findReverse(str);
		startcapitalleter(str);

	}

}
