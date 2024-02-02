package Com.demo.Switch1;

import java.util.Scanner;

public class Assignment1_9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		double area,r,b,h;
		System.out.println("Enter choice=");
		int choice=sc.nextInt();
		
        switch(choice) {
        case 1:
        	System.out.println("Enter Radius=");
        	 r=sc.nextInt();
        	 area=3.14*r*r;
        	 double cum=2*3.14*r;
        	 System.out.println("area is ="+area);
        	 System.out.println("Circumference is ="+cum);
        	 break;
        case 2:
        	System.out.println("Enter side of square=");
        	int side=sc.nextInt();
        	area=side*side;
        	System.out.println("area is ="+area);
        	break;
        case 3:
        	System.out.println("Enter width and height of rectangle=");
        	int w=sc.nextInt();
        	 h=sc.nextInt();
        	 area=w*h;
        	 System.out.println("Area of rectangle ="+area);
        	 break;
        	
        }
	}

}
