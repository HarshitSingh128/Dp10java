package practiceonly;

public class evennum {
	public static void even() {
		int i;
		int sum=0;
	
		for(i=1;i<=50;i++) {
			if(i%2==0) {
				sum=sum+i;
				
				//System.out.println(i);
				//System.out.println("even num");
			}
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		even();
	

	}

}
