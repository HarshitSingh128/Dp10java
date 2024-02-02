package Com.demo.loop;

public class Practiceseries {
	public static void Series() {
		int i;

		int sum = 0;

		for (i = 1; i <= 10; i++) {
			sum = sum + sum + 1;
			System.out.println(sum);

		}
	}

	public static void main(String args[]) {
		int n;
		Series();

	}

}
