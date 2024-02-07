package com.demo.practice;
//6.  Write two methods that return the average of an array with following headers.
//a.  public static int average(int[] array)
//b.  public static double average(double[] array).
//c.  Write main and invoke the 2 methods.
public class AverageTest {
	public static int average(int array[]) {
		int sum=0;
		int average;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
			
		}
		average=sum/array.length;
		return average;
		
		
	}
	public static double average1(double array[]) {
		int sum=0;
		int average;
		for(int i=0;i<array.length;i++) {
			sum+=array[i];
			
		}
		average=sum/array.length;
		return average;
		
		
	}

	public static void main(String[] args) {
		int ar[]= {2,4,5,6};
		System.out.println("Average is:"+average(ar));
		System.out.println(average(ar));
		
		

	}

}
