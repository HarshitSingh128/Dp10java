package com.demo.intermediate;
//Wap to print zero at end using shifting method
import java.util.Arrays;

public class ShiftZerosEnd {
	static void shiftZeros(int ar[]) {
		int count=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]!=0) {
				ar[count]=ar[i];
				count++;
				
			}
		}
		while(count<ar.length) {
			ar[count++]=0;
		}
	}


	public static void main(String[] args) {
		int arr[]= {5,6,0,-7,5,0,7,7,0};
		 shiftZeros(arr);
		 System.out.println(Arrays.toString(arr));
		
	}

}
