package com.demo.intermediatearrays;
//6>> Find frequency of each element from char array
public class Frequencychar {
	public static void findfrequencychar(char ar[]) {
		int count;
		boolean status;
		for (int i = 0; i < ar.length; i++) {
			count = 1;
			status = false;

			for (int j = i - 1; j >= 0; j--) {
				if (ar[i] == ar[j]) {
					status = true;
					break;
				}
			}
			if (status == false) {
				for (int k = i + 1; k < ar.length; k++) {
					if (ar[i] == ar[k])
						count++;
				}

				System.out.println(ar[i] + ":" + "Frequency is: " + count);
			}
		}
	}

	public static void main(String[] args) {
		char ch[] = { 'a', 's', 's', 'q', 'q', 'p' };
		findfrequencychar(ch);

	}

}
