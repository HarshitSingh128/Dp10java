package Com.demo.loop;

import java.util.Scanner;

public class Assigment1_8 {
	public static void countdigit(int num) {
	//int rem;
	int count =0;
	while (num != 0) {
		//rem = num % 10;
		num = num / 10;
		count++;
	}
	System.out.println("count=" + count);
}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number=");
		int num=sc.nextInt();
		countdigit(num);
		

	}

}
