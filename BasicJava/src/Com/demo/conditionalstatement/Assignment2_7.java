package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Assignment2_7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character=");
		char y=sc.next().charAt(0);
		 if (y=='@'  || y=='$' || y=='#' )
		{ System.out.println("Special character=");
		}
		 else if (y>='0' && y<='9')
		 {
			 System.out.println("Digit=");
		 }
		else {
			System.out.println("Alphabet=");
		}
		}
		
		

	}


