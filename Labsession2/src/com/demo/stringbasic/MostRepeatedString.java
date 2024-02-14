package com.demo.stringbasic;

//5. WAP to find the most repeated word in a string
public class MostRepeatedString {
	public static void repeatedtest(String st) {
		String s[] = st.split(" ");
		int count = 0;
		boolean flag;
		int max = 0;
		String res = s[0];

		for (int i = 0; i < s.length; i++) {
			count = 1;
			flag = false;
			for (int j = i - i; j >= 0; j--) {
				if (s[i].equalsIgnoreCase(s[j])) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				for (int k = i + 1; k < s.length; k++) {
					if (s[i].equalsIgnoreCase(s[k])) {
						count++;
					}
				}
				if (count > 1) {
					res = s[i];
					max = count;

				}

			}

		}

		System.out.println("Most reapeated word:" + res + " " + max);

	}

	public static void main(String[] args) {
		String s1 = "I LIKE JAVA AND I LIKE PYTHON";
		repeatedtest(s1);
	}

}
