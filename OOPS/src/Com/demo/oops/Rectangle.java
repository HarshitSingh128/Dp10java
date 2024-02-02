package Com.demo.oops;

public class Rectangle {
	
	double lenght;
	double breadth;
	
	public void setdata(double len,double br) {
		lenght=len;
		breadth=br;
		
	}
	public void displaydata() {
		System.out.println("Lenght:"+lenght);
		System.out.println("Breadth:"+breadth);
	}
	public double CalArea() {
		return lenght*breadth;
	}
	public double CalPerimeter() {
		return 2*(lenght+breadth);
	}

}
