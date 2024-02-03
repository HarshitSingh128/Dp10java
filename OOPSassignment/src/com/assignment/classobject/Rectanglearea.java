package com.assignment.classobject;
//calculate the area of rectangle
public class Rectanglearea {
	int lenght;
	int breadth;
		public void setdata(int len,int br) {
		lenght=len;
		breadth=br;
		

	}
	public void calarea() {
		double area=lenght*breadth;
		System.out.println("Area :="+area);
	}
	
	

	public static void main(String[] args) {
		Rectanglearea r1=new Rectanglearea();
		r1.setdata(10,20);
		r1.calarea();
		
	}

}
