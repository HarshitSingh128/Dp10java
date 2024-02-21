package com.demo.stackdemo;

class MyStack {
	int top;
	int size;
	int stk[];

	public MyStack() {
	}

	public MyStack(int size) {
		this.size = size;
		top = -1;
		stk = new int[this.size];
	}

	boolean push(int data) {
		if (top < size - 1) {
			top++;
			stk[top] = data;
			return true;
		} else
			return false;
	}

	void pop() {
		if (top != -1) {
			System.out.println("Element deleted:" + stk[top]);
			top--;
		} else {
			System.out.println("Stack is empty");
		}
	}
	void display() {
		if(top!=-1) {
			System.out.println();
			System.out.print("[");
			for(int i=0;i<=top;i++) {
				System.out.print(stk[i]+",");
			}
			System.out.print("]");
			System.out.println();
		}
		else {
			System.out.println("Stack is empty");
		}
	}

}

public class Stackarray {
	public static void main(String[] args) {
		MyStack s1=new MyStack(3);
		System.out.println(s1.push(78));
		System.out.println(s1.push(79));
		s1.display();
		
		System.out.println(s1.push(76));
		System.out.println(s1.push(73));
		s1.display();
		
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		
	}

}
