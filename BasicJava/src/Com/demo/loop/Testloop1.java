package Com.demo.loop;

public class Testloop1 {
	 
	public static void printname() {
		int i;
		for(i=1;i<=5;i++) {
			System.out.println(i);
			
				
			}
		System.out.println("i="+i);
			
		}
	public static void reverseLoop() {
		int i;
		for(i=5;i>=1;i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		  printname();
		  reverseLoop();
		
		
	}

}
