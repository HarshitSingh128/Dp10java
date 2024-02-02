package Com.demo.patterns;

public class assign3_B {
	public static void pattern2() {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern2();

	}

}
