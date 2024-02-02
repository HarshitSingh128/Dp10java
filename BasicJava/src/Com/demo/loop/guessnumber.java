package Com.demo.loop;

import java.util.Scanner;

public class guessnumber {
	public static void guess() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		 int num = sc.nextInt();
		int count = 0;
		int guess = 50;
		while (num>0) {
			if(num==guess) {
			System.out.println("Guess is right");
			break;
			}
			
			if (num < guess) {
				System.out.println("guess is too low=");
				System.out.println("Enter number=");
				num = sc.nextInt();
			} else if (num > guess) {
				System.out.println("guess is too high=");
				System.out.println("Enter number=");
				num = sc.nextInt();
				break;
			}
			
			count++;

		}
		
		System.out.println("count is =+count");
	}

	public static void main(String args[]) {
		int n = 0;
		int num = 0;
		guess();

	}
}
