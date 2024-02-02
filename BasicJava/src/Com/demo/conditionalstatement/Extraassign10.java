package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Extraassign10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double computer,biology,physics,chemistry,math,percentage,totalmarks;
		totalmarks=50;
		System.out.println("Enter computer marks=");
		computer=sc.nextDouble();
		System.out.println("Enter biology marks=");
		biology=sc.nextDouble();
		System.out.println("Enter physics marks=");
		physics=sc.nextDouble();
		System.out.println("Enter chemistry marks=");
		chemistry=sc.nextDouble();
		System.out.println("Enter maths marks");
		math=sc.nextDouble();
		percentage=(computer+biology+physics+chemistry+math)*100/totalmarks;
		if(percentage>=90)
		{ System.out.println("Grade A=");
		}
		else if(percentage>=80) {
			System.out.println("Grade B=");
		}
		else if(percentage>=70) {
			System.out.println("Grade C=");
		}	
		else if(percentage>=60){
			System.out.println("Grade D=");
		}
		else if(percentage>=40) {
			System.out.println("Grade E=");
		}
		else {
			System.out.println("Grade F=");  
		}
			
		
		
		}
		
		
		

	}


