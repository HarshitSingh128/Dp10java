package Com.demo.Switch1;

import java.util.Scanner;

public class Assignment1_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
     int num;
     System.out.println("Enter number=");
     num=sc.nextInt();
     switch(num%2) {
     case 0:
    	System.out.println("Number is even=");
    	 
    	 break;
     case 1:
    		 System.out.println("number is odd=");
    		 break;
    		 default:
    			 System.out.println("neither even nor odd=");
    		 
     
     }
	}

}
