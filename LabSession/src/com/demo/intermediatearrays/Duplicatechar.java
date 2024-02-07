package com.demo.intermediatearrays;

public class Duplicatechar {
	public static void duplicatecharTest(char ar[]) {
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
				if(count>1) {
					System.out.println("Duplicate character is:"+ar[i]);
				}
			}
		}
		
	}


	

	public static void main(String[] args) {
		char ch[] = { 'a', 'a', 'a', 'b', 'b', 'c' ,'c'};
		duplicatecharTest(ch);

	}

}
