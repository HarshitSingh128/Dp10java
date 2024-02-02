package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Extraassign3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.println("Enter character=");
	        
			char y=sc.next().charAt(0);
			if (y=='a' || y=='e' || y=='i' || y=='o' || y=='u' || y=='A' || y=='E' || y=='I'|| y=='O' || y=='U' )
			{
				System.out.println(" vowel=");
			}
			else {
				System.out.println("consonent=");
			}

	}

}
