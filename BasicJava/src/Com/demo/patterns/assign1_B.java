package Com.demo.patterns;

public class assign1_B {
	public static void pattern() {
		int i,j;
		for(i=4;i>=1;i--) {
			for(j=1;j<=i;j++) {
				System.out.print("# ");
			}
			System.out.println();
			
		}
	}
	

	public static void main(String[] args) {
		pattern();
	}

}
