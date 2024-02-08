package com.demo.frequency;

public class FrequencyDemo {
	static void findFrequency(int ar[]) {
		int count;
		boolean flag;
		for(int i=0;i<ar.length;i++) {
			count=1;
			flag=false;
			//check if the element is new 
			for(int j=i-1;j>=0;j--) {
				if(ar[i]==ar[j]) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				for(int k=i+1;k<ar.length;k++) {
					if(ar[i]==ar[k]) {
						count++;
						
					}
					
				}
				//frequency
				System.out.println(ar[i]+":" +"Frequency is: "+count);
//				//duplicate
//				if(count>1) {
//					//System.out.println("duplicate is"+ar[i]);
//			}
////				//unique 
//				if(count==1) {
//					System.out.println(ar[i]);
//				}
			}
		}
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,1,1,2,3,3,3,4,7};
		findFrequency(arr);
		
	}

}
