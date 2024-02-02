package Com.demo.staticmethod;
class Car{
	
	static int wheels;
	static {
		m1();
	}
	{
		System.out.println(++wheels);
	}
	Car(String color){
		this.color=color;
	}
	static void m1() {
		System.out.println("Color:"+color);
		
	}
	static String color="Red";
	static {
		m1();
	}
	{
		++wheels;
	}
}

public class Output {

	public static void main(String[] args) {
		Car c1=new Car("yellow");
		System.out.println("BMW:"+c1.wheels);
		System.out.println("BMW color:"+c1.color);
		

	}

}
