package com.demo.intermediate;

import java.util.Arrays;

public class SecondHighest {
	public static int findSecondHighest(int ar[] ){
		int highest=Integer.MIN_VALUE;
		int shighest=Integer.MIN_VALUE;
//		for(int x:ar) {
//			if(x>highest) {
//				shighest=highest;
//				highest=x;
//			}
//			else if(x>shighest) {
//				shighest=x;
//			}
//		}
		for(int i=0;i<ar.length;i++)
			{
				if(ar[i]>highest)
				{
					shighest=highest;
					highest=ar[i];
				}
				else if(ar[i]>shighest)
				{
					shighest=ar[i];
				}
			}
		return shighest;
		
	}
	public static int findsecondLowest(int ar[]) {
		int lowest=Integer.MAX_VALUE;
		int secondLowest=Integer.MAX_VALUE;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]<lowest) {
				secondLowest=lowest;
				lowest=ar[i];
			}
			else if(ar[i]<secondLowest) {
				secondLowest=ar[i];
			}
		}
		return secondLowest;
	}

	public static void main(String[] args) {
		int arr[]= {-2,5,8,7,6};
		System.out.println(Arrays.toString(arr));
		int sh=findSecondHighest(arr);
		
		System.out.println("Second highest is:"+sh);
		System.out.println("--------------------");
		
	int sh1=findsecondLowest(arr);
	System.out.println("Second Lowest is:"+sh1);
	

	}

}
