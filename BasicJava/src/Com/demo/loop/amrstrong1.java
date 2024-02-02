package Com.demo.loop;

public class amrstrong1 {

	public static void main(String[] args) {
		int num;
		int i;
		int count=0;
		int rem;
		int sum=0;
		
		System.out.println("Armstrong numbers from 1 to 5000=");
		for(i=1;i<=5000;i++) {
			num=i;
			while(num>0)
			{
				rem=num%10;
				sum=sum+(rem*rem*rem);
				num/=10;
			}
			if(sum==i) {
				System.out.println(i);
			}
			sum=0;
		}
		

	}

}
