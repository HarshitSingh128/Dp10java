package Com.demo.methodoverloading;

 class Typepramotion {
	static void display(int n) {
		System.out.println("In int");
		System.out.println(n);
	}
	static void dispaly(char n) {
		System.out.println("In char");
		System.out.println(n);
		
	}
	static void display(float n) {
		System.out.println("in float ");
		System.out.println(n);
	}
	static void display(long n) {
		System.out.println("In long");
		System.out.println(n);
	}
	static void display(int n,double d1) {
		System.out.println("in method 1");
		System.out.println("ans"+(n+d1));
	}
	static void display(long n,float f1) {
		System.out.println("In method 2");
		System.out.println("ans "+(n+f1));
	}

}
 public class  Type{
	 public static void main(String[] args) {
		Typepramotion.display(5);
		Typepramotion.display('a');
		Typepramotion.display(4.5f);
		Typepramotion.display(5l);
	}
 }
