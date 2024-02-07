package com.demo.intermediatearrays;
//5>> Find the unique elements from char array
public class Uniquechartest {
	public static void uniquechar(char ar[]) {
		int count;
		boolean status;
		for(int i=0;i<ar.length;i++) {
			count=1;
			status=false;
			
			for(int j=i-1;j>=0;j--) {
				if(ar[i]==ar[j]) {
					status=true;
					break;
				}
			}
			if(status==false) {
				for(int k=i+1;k<ar.length;k++) {
					if(ar[i]==ar[k])
						count++;
				}
				if(count==1) {
					System.out.println("Unique character is:"+ar[i]);
				}
			}
		}
		
	}

	public static void main(String[] args) {
		char  ch[]= {'a','s','s','q','q','p'};
		uniquechar(ch);
		

	}

}
