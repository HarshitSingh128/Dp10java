package com.demo.wordslogical;

public class FrequenctofWords {
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
				System.out.println(s[i]+": "+"Frequency is"+"<"+count);
			
			}
		}
	}

	public static void main(String[] args) {
		String str="A big cat is rolling on a big mat";
		System.out.println(str);
		findFrequency(str);


	}

}
