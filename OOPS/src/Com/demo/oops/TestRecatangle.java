package Com.demo.oops;

import java.util.Scanner;

public class TestRecatangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double len,br;
		System.out.println("Enter lenght:");
		len=sc.nextDouble();
		System.out.println("Enter br:");
		br=sc.nextDouble();
		Rectangle r1=new Rectangle();
		r1.setdata(len, br);
		r1.displaydata();
		System.out.println("Area :"+r1.CalArea());
		System.out.println("Perimeter:"+r1.CalPerimeter());

	}

}
