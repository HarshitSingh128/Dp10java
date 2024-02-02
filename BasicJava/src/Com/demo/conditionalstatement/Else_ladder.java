package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Else_ladder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number=");
		int number;
		number=sc.nextInt();
       if (number%5==0)
       {
    	System.out.println("hello=");
       }
       else if(number%3==0)
       {
    	   System.out.println("welcome=");
       }
       else if (number%6==0)
       {
    	   System.out.println("good morning=");
       }
       else {
    	   System.out.println("good bye=");
       }

	}

}
