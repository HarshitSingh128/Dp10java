package Com.demo.loop;

public class Harshadnumber {

	public static void main(String[] args) {
		int num = 156;
		int rem = 0;
		int sum = 0;
		int temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num /= 10;

		}
		if (temp % sum == 0) {
			System.out.println("Harshad=");
		} else
			System.out.println("not harsad");

	}

}
