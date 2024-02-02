package Com.demo.loop;

public class Practice_series_3 {
	public static void Series() {
		int i;

		int sum = 0;
		int num = 2;

		for (i = 1; i <= 10; i++) {
			sum = sum + sum + 1;
			System.out.println(sum);

			num = (num + num) - 1;
			System.out.println(sum);
		}
	}

	public static void main(String[] args) {
		Series();
	}

}
