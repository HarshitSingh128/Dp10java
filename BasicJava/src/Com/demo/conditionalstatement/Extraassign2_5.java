package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Extraassign2_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int weaknumber;
		System.out.println("Enter weak number=");
		weaknumber=sc.nextInt();
		if(weaknumber==1)
		{ System.out.println("The day is Sunday=");
		
			}
		else if  (weaknumber==2) {
			System.out.println("The day is Monday=");
		}
		else if(weaknumber==3) {
			System.out.println("The day is Tuesday=");
		}
		else if (weaknumber==4) {
			System.out.println("The day is Wednesday");
		}
		else if(weaknumber==5) {
			System.out.println("The day is Thursday=");
		}
		else if (weaknumber==6) {
			System.out.println("The day is Friday=");
			
		}
		else if (weaknumber==7) {
			System.out.println("The day is Saturday=");
		}
		else {
			System.out.println("This day does not exist in weak=");
		}
		}

}
