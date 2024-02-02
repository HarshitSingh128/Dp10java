package com.demo.basic;

public class ArrayLogics {
	static boolean searchElement(int ar[],int ele) {
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ele)
				return true;
		}
		return false;
	}
	static void searchOccurances(int ar[],int ele) {
		boolean flag=false;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]==ele) {
				flag=true;
				System.out.println("Index is:"+i);
			}
				
			}
		if(!flag)
			System.out.println("elements not found");
				}

	public static void main(String[] args) {
		int arr[]= {6,4,5,7,6,4,1,0};
		
		if(searchElement(arr,6))
		{
			System.out.println("Element found");
		}
		else {
			System.out.println("Element not found");
		}
		System.out.println("====");
		searchOccurances(arr,6);
	

	}

}
