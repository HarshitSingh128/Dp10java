package com.demo.varags;

public class Ruleofvarags {
	//Rule1: we can have only 1 varags
	// static display(int...a,String ...s){
//   }
//	Rule:2 last argument in the method
//	static void meth1(in n1,int ...a,int n2) {
//		
//	}
static void meth1(int n1,int n2,int ...a) {
	System.out.println(n1);
	System.out.println(n2);
	for(int x:a) {
		System.out.println(x);
	}
}
	public static void main(String[] args) {
		meth1(5,6,4,5,4,6);
		

	}

}
