package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Extraassign4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char y;
		System.out.println("Enter character=");
		y=sc.next().charAt(0);
		if(y>='a' && y<='z') {
			System.out.println("It is lower case letter=");
		}
		else if (y>='A' && y<='Z') {
			System.out.println("It is upper case letter =");
		}
		else {
			System.out.println("it is special character=");
		}
		}
			

	}


