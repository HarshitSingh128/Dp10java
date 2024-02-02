package com.demo.basic;
//WAP to print maximum character 
import java.util.Arrays;

public class MaxCharTest {
	public static void charTest(char ch[]) {
		char max=ch[0];
		 char min=ch[0]; 
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>max) {
				max=ch[i];
			}
			else if(ch[i]<min) {
				min=ch[i];
			}
			
		}
		System.out.println(Arrays.toString(ch));
	System.out.println("Max:"+max);
	System.out.println("Min is :"+min);
			
		}
	

	public static void main(String[] args) {
		char c[]= {'a','b','c','d','f'};
		charTest(c);
	

	}

}
