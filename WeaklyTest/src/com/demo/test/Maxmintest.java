package com.demo.test;

import java.util.Arrays;

public class Maxmintest {
	public static void lefttest(int a[]){
		int temp=a[0];
		for(int i=1;i<a.length;i++){
		   a[i-1]=a[i];
		   
		   
		}
		a[a.length-1]=temp;
		System.out.println(Arrays.toString(a));
	
		}

		public static  void main(String args[]){
		int ar[]={1,2,3,4,5,6,7};
		for(int i=0;i<3;i++){
		   lefttest(ar);
		}

		}
		}

	
	

