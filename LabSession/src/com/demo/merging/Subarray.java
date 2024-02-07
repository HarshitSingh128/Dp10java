package com.demo.merging;

public class Subarray {
	static void  subArray ( int arr[],  int sum )  
	{  
	    int temp, i , j , k ;  
	    
	    for ( i = 0 ; i < arr.length ; i++ )   
	    {  
	        temp= arr[ i ] ;  
	      
	        for ( j = i + 1 ; j <= arr.length ; j++ )   
	        {  
	            if (temp == sum) {  
	            System.out.println(" Sum found between indexes"+i+" "+(j-1)) ;  
	            System.out.print    ( " Printing the required subarray: \n " ) ;  
	                for( k = i ; k <= j - 1 ; k++ )  
	                {  
	                	System.out.print( arr[ k ]+" " ) ;  
	                }  
	                                            
	            }  
	            if ( temp > sum || j == arr.length )  
	                break ;  
	            temp = temp + arr[ j ] ;  
	        } 
	        System.out.println("");
	    }  
	
		
	}

	public static void main(String[] args) {
		int arr[]= {12,4,2,10,5,1};
		int sum=16;
		subArray(arr,sum);
		// TODO Auto-generated method stub

	}

}
