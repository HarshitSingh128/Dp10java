
package Com.demo.inheritance;

public class AccessDemo {
	private int a;
	int b;
	protected int c;
	public int d;
    
	 private void show() {
		 System.out.println("sum");
	 }
	 void display() {
		 System.out.println("harshit");
	 }
	 protected void Info() {
		 System.out.println("check");
	 }
	 public void Data() {
		 System.out.println("do your work");
	 }
	 
}
class Demo extends AccessDemo{
	public static void main(String[] args) {
		AccessDemo a1=new AccessDemo();
		//a1.a=90;
		a1.b=8;
		a1.c=7;
		a1.d=8;
		//a1.show();
		a1.display();
		a1.Info();
		a1.Data();
	}
}