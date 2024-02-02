package Com.demo.inner;
class Bank{
	private static String bname="SBI Bank";
	String bankloc;
	String ifscCode;
	String aName;
	int accNo;
	{
		bankloc="Delhi";
		ifscCode="SBIND202";
		
	}
	Bank(){
		
	}
	Bank(int accNo,String aName){
		this.accNo=accNo;
		this.aName=aName;
	}
	void displayBankDetails() {
		System.out.println(bname+" "+bankloc);
		System.out.println(ifscCode);
	}
	//Before jdk 1.8 we cannot static variables are method in member inner class
	class Locker{
		int lockerId;
		String pass;
		static float LockerRent =2000;
		
		Locker(){
			
		}
		public Locker(int lockerId,String pass) {
			this.lockerId=lockerId;
			this.pass=pass;
		}
//		static void show() {
//			Bank b1=new Bank();
//			System.out.println("This locker belongs to :"+b1.aName+"With AccNo"+b1.accNo);
//		}
		void displayLockerDetails() {
			displayBankDetails();
			System.out.println("This locker belongs to:"+aName +"With accNo:"+accNo);
					System.out.println("Locker Id:"+lockerId);
			System.out.println("Rent to be paid :"+LockerRent);
			
		}
	}
}

public class BankLockerDemo {

	public static void main(String[] args) {
		Bank cust1=new Bank(1011,"OnKar");
		Bank.Locker lock1=cust1.new Locker(10,"On123");
		cust1.displayBankDetails();
		System.out.println("==================");
		lock1.displayLockerDetails();
		
		System.out.println("============================");
		Bank.Locker lock2=new Bank(201,"Rahul").new Locker(12,"R123");
		lock2.displayLockerDetails();
	
	}

}
