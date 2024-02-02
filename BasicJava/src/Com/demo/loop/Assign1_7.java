package Com.demo.loop;

import java.util.Scanner;

public class Assign1_7 {
	public static void sumodd(int n) {
		int i;
		int sum=0;
		for(i=1;i<=n;i++) {
			if(i%2!=0) {
				sum=sum+i;
				
			}
		}
		System.out.println("sum="+sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter n=");
		n=sc.nextInt();
		sumodd(n);
		

	}

}
