package com.demo.stackdemo;

import java.util.Stack;

//Stack is subclass of vector
public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stk=new Stack<>();
		stk.push("Pradnya");
		stk.push("Onkar");
		stk.push("Shreyash");
		
		System.out.println(stk);
		
		System.out.println(stk.peek());
		System.out.println(stk);
		System.out.println(stk.pop());//delete element
		System.out.println(stk);
		
		System.out.println(stk.search("Onkar"));
		System.out.println(stk.search("Harshit"));
	}

}
