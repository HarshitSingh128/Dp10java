package Com.demo.oops;
//compilable
class Rectangle1{
	//instance variable
	double len;
	double br;
	public void color() {
		System.out.println("color instance method");
	}
}
//executable
public class TestRect {

	public static void main(String[] args) {
		Rectangle1 r1=new Rectangle1();
		r1.color();
		System.out.println(r1.len);
		System.out.println(r1.br);
		
	}

}
