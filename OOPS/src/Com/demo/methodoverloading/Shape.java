package Com.demo.methodoverloading;

 class Shapetest {
	void Area(int side) {
		System.out.println("Area of Square :"+side*side);
	}
	void Area (int length,int breadth) {
		System.out.println("Area of Rectangle :"+length*breadth);
	}
	void Area (float radius ) {
		System.out.println("Area of circle :"+3.14*radius*radius);
	}
	static void Areatset(int side) {
		System.out.println("Area of Square :"+side*side);
	}
	static void Areatset(int length,int breadth) {
		System.out.println("Area of Rectangle :"+length*breadth);
	}
	static void Areatest (float radius ) {
		System.out.println("Area of circle :"+3.14*radius*radius);
	}

}
public class Shape{
	public static void main(String[] args) {
		Shapetest s1=new Shapetest(); 
		s1.Area(4);
		s1.Area(25,25 );
		s1.Area(4.5f);
		Shape.main(6);
	}
	//we can overload main method because main method is static and loaded during compile time 
	//But JVM always call main method with String array as arguments
	//if we want ro call mother main method we can call it explicitly
	public static void main(int side) {
		System.out.println("area of square :"+side*side);
		
	}
}
