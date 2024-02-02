package practiceonly;

public class Harsadnum {
	int num;
	public Harsadnum(int num) {
		this.num=num;
		int rem;
		int temp=num;
		int sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		if(temp%sum==0) {
			System.out.println("harsad number:");
		}
		else
		System.out.println("not Harsad nub");
	}
	
	

	public static void main(String[] args) {
		Harsadnum h1 = new Harsadnum(54);
	

	}

}
