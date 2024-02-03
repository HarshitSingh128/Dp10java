package com.demo.arraybasicdemo;

public class SearchNub {
	static boolean searchElement(int a[], int element) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==element) {
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		int arr[]= {2,6,5,4,7};
		if(searchElement(arr,5)) {
			System.out.println("element found");
		}
		else 
			System.out.println("Not element found");
	

	}

}
