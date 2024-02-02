package Com.demo.loop;

import java.util.Scanner;

public class calculatorbydowhile {
	public static int add(int a,int b) {
		return a+b;
	}
	public static int sub (int a,int b) {
		return a-b;
	}
	public static int multiply(int a,int b) {
		return a*b;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n1,n2,ans=0;
		char ch;
		do {
		System.out.println("Enter n1:");
		n1=sc.nextInt();
		System.out.println("Enter n2:");
		n2=sc.nextInt();
		System.out.println(" ----simple calculator");
		System.out.println("1.add\n2.sub\n3.multiply");
		System.out.println("Enter choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			ans=add(n1,n2);
			break;
		case 2:
		ans=sub(n1,n2);
		break;
		case 3:
			ans=multiply(n1,n2);
			break;
		default:
			System.out.println("invalid input=");
		}
		System.out.println("ans :"+ans);
		System.out.println("do you want to continue?? if yes enter Y");
		ch=sc.next().charAt(0);
		} while(ch=='y' || ch=='Y');
		System.out.println("thank you=");
		
			
		}
		
			
		}
		

	


