package Com.demo.loop;

public class Assignment1_4 {
	public static void break1() {
		int i;
		for (i = 1; i <= 10; i++) {
			if (i == 8)
				break;
			if (i == 4)
				continue;
			System.out.println(i);

		}

	}

	public static void main(String[] args) {
		break1();

	}

}
