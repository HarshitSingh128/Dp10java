package Com.demo.operators;

public class Home10 {

	public static void main(String[] args) {
		int x=0010, y=000010, z=100;
		//    i= 000 + 8 - 100 - 98 +   10 - -1 + 10 -  -2
		//  i= 000+8-100 -98 +10 +1 +10 +2
		//
		int i= --x + y++ - z-- - --z + ++y - --x + y-- - --x;
//		System.out.println("x="+x);
//		System.out.println("y="+y);
//		System.out.println("z="+z);
//		System.out.println("i="+i);
//		// TODO Auto-generated method stub
		System.out.println(x);
		

	}

}
