package Com.demo.Switch1;

import java.util.Scanner;

public class Assignment1_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		int ans=0;
		int choice;
		System.out.println("Enter num1=");
		n1=sc.nextInt();
		System.out.println("Enter num2=");
		n2=sc.nextInt();
		System.out.println("1.add\n2.sub\n3.multiply\n4.div=");
		System.out.println("Enter choice=");
		choice=sc.nextInt();
		switch(choice) {
		case 1:ans=n1+n2;
		System.out.println("ans is ="+ans);
		break;
		case 2:
			ans=n1-n2;
			System.out.println("ans is ="+ans);
			break;
		case 3:
			ans=n1*n2;
			System.out.println("ans is ="+ans);
			break;
		case 4:
			ans=n1/n2;
			System.out.println("ans is =" +ans);
			break;
			default :
				System.out.println(" value is not exist=");
		}

	}

}
