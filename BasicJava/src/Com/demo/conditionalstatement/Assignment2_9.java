package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Assignment2_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int month;
		System.out.println("Enter month number=");
		month=sc.nextInt();
		if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
		{
			System.out.println("the days of month is 31=");
		}
		else if (month==4 || month==6 || month==9 || month==11)
		{
			System.out.println("the days of month is 30=");
		}
		else if (month==2)
		{
			System.out.println("days is either 29 or 28=");
		}
			else 
			{
				System.out.println("days is 1 to 12=");
			}
		}	

	}


