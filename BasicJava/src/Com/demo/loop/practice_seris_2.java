package Com.demo.loop;

public class practice_seris_2 {
	public static void Series() {
		int i;
		int sum = 2;
		for (i = 2; i <= 10; i++) {

			System.out.println(sum);
			sum = (sum + sum) - 1;
		}
	}

	public static void main(String[] args) {
		Series();

	}

}
