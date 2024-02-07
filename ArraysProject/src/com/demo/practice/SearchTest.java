package com.demo.practice;
//.  WAP to search for a given number in an array and accordingly print the index if exists.
public class SearchTest {
	public static boolean occurance(int a[], int ele) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ele) {
				return true;
			}

		}
		return false;

	}
	public static void printIndex(int a[],int ele) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ele) {
				System.out.println("Index is:"+i);
			}
		}
	}

	public static void main(String[] args) {
		int ar[] = { 2, 4, 5, 9 };
		if (occurance(ar, 4)) {
			System.out.println("element found ");
			
		} else {
			System.out.println("element not found");
		}

	
	printIndex(ar,4);
	}
}
