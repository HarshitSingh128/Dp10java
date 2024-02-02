package Com.demo.loop;

public class Assignment1_3 {
	public static void even() {
		int i=121;
		do {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
			
		}while(i<=229);
		System.out.println("odd numbers");
		
	}

	public static void main(String[] args) {
		even();
	}

}
