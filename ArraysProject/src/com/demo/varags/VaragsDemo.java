package com.demo.varags;

public class VaragsDemo {
	static void calcSum(int ar[]) {
		int sum=0;
		for(int x:ar) {
			sum+=x;
		}
		System.out.println("sum is"+sum);
	}
	//ellipsis..
	static void findSum(int ...ar) {
		int sum=0;
		for(int x:ar) {
			sum+=x;
		}
		System.out.println("sum is:"+sum);
	}

	public static void main(String[] args) {
		int a1[]= {2,3};
		int a2[]= {2,5,7};
		int a3[]= {1,0,2,3,4,5};
		calcSum(a1);
		calcSum(a2);
		calcSum(a3);
		System.out.println("++++++++++++++++++++++++++++");
       findSum(1,2);
       findSum(1,2,4,5,6);
       findSum(1,2,3);
       
		

	}

}
