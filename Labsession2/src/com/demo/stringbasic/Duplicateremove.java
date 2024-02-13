package com.demo.stringbasic;

//2. WAP to remove all the duplicate words from a string
public class Duplicateremove {
	public static void removeduplicate(String st) {
		String[] s = st.split("\\s");
		int count;
		boolean flag;
		for (int i = 0; i < s.length; i++) {
			count = 1;
			flag = false;
			for (int j = i - 1; j >= 0; j--) {

				if (s[i] != null && s[i].equalsIgnoreCase(s[j])) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				for (int k = i + 1; k < s.length; k++) {
					if (s[i] != null && s[i].equalsIgnoreCase(s[k])) {
						count++;
						s[k] = null;
					}

				}
				if (s[i] != null) {
					System.out.println(s[i] + ": " + "After removing duplicate" + "<" + count);

				}

			}
		}

	}
	

	public static void main(String[] args) {
		String str = "java is fun and java is a very intersting";
		System.out.println(str);
		removeduplicate(str);

	}

}
