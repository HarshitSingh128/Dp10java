package com.demo.basic;

public class TraverseArray {

	public static void main(String[] args) {
	int arr[]=new int[5];
	arr[0]=90;
	arr[1]=89;
	arr[2]=78;
    arr[3]=78;
    arr[4]=75;
    
    
    //arr[5]=45;//index out of bound
    for(int i=0;i<arr.length;i++) {
    	System.out.println(arr[i]);
    	
    }
    System.out.println("=====");
    //array as a literal 
    //int arr1[]={5,1,2,24,};//new int []
    int arr1[]=new int[] {5,4,5,7,4};
    for(int i=0;i<arr.length;i++) {
    	System.out.println(arr1[i]);
    		
    }
	}

}
