package Com.demo.method;

public class MethodTest1 {
	
	  public static void show() {
		  System.out.println("hello world=");
	  }
	  public static void add(int a,int b) {
		  int sum=a+b;
		  System.out.println("sum="+sum);
	  }
	  
	  public static void main(String[] args) {
		  System.out.println("main=");
		  show();
		  add(10,20);
		
	}

}
