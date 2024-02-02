package Com.practice;

import java.util.Scanner;

class testrect{
	int lenght;
	int breadth;
	public void setData(int lenght,int breadth) {
		this.lenght=lenght;
		this.breadth=breadth;
	}
	public void showDta() {
		System.out.println("Lenght:"+lenght);
		System.out.println("Breadth:"+breadth);
	}
	public int calArea() {
		return lenght*breadth;
	}
	public double calPerimeter() {
		return 2*(lenght+breadth);
	}
	
}

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter lenght");
		int lenght=sc.nextInt();
		System.out.println("Enter breadth");
		int breadth=sc.nextInt();
		testrect t1=new testrect();
		t1.setData(lenght, breadth);
		t1.showDta();
		//t1.calArea();
		//t1.calPerimeter();
		System.out.println("Area :"+t1.calArea());
		System.out.println("perimeter:"+t1.calPerimeter());

		

	}

}
