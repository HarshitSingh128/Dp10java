package com.dmo.testdemo;

import java.util.ArrayList;
import java.util.Collections;

public class Studentname {
	public static void main(String args[]){
		ArrayList<String> a1=new ArrayList<>();
		for(int i=1000;i<=9999;i++){
			int temp1=i%100;
			int temp2=i/100;
			int sum=temp1+temp2;
			if(i==sum*sum){
			System.out.println("Number:"+i);
			}
		}
	
	}
	}


