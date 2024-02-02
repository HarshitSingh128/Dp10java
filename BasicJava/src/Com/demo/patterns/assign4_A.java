package Com.demo.patterns;

public class assign4_A {
	public static void pattern() {
		int i,j;
		for(i=5;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern();
		

	}

}
