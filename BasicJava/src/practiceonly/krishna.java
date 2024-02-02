package practiceonly;

import java.util.Scanner;

public class krishna {
	public static void kr(int num) {
		int i;
		int rem;
		int sum=0;
		int fact=1;
		int temp=num;
		while(num>0) {
			rem=num%10;
			for(i=1;i<=rem;i++) {
				
				fact=fact*i;
			}
			sum=sum+fact;
			num/=10;
		}
		if(temp==num) {
			System.out.println("krsh"); 
			
			
		}
		else 
			System.out.println("nk");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter num=");
		int num=sc.nextInt();
     kr(num);
		
	}

}
