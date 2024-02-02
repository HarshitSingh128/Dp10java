package Com.demo.inheritance;

class Vehicle1 {
	private int vno;
	private String model;
	protected double price;

	public Vehicle1() {

	}

	public Vehicle1(int vno, String model, double price) {
		this.vno = vno;
		this.model = model;
		this.price = price;
	}

	public void setvno(int vno) {
		this.vno = vno;
	}

	public int getvno() {
		return vno;
	}

	public void setmodel(String model) {
		this.model = model;

	}

	public String getmodel() {
		return model;
	}

}

class Car1 extends Vehicle1{
	protected int noofGears;
	private String fuelType;

	Car1() {

	}

	public Car1(int vno, String model, double price, int noofGears, String fuelType) {
		super(vno, model, price);
		System.out.println("In car para const");
		this.noofGears = noofGears;
		this.fuelType = fuelType;
	}

	public void setfuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String getfuelType() {
		return fuelType;
	}

	public String toString() {
		return "Car:" + getvno() + " " + getmodel() + " " + price + " " + noofGears + " " + fuelType;
	}
}

class SportsCar extends Car1 {
		private double maxspeed;
		private double mileage;

		public SportsCar() {

		}

		public SportsCar(int vno, String model, double price, int noofGears, String fuelType, double maxspeed,double mileage) {
			super(vno, model, price, noofGears, fuelType);
			this.maxspeed = maxspeed;
			this.mileage = mileage;

		}

		public void setMaxspeed(double maxspeed) {
			this.maxspeed = maxspeed;
		}

		public double getMaxspeed() {
			return maxspeed;
		}

		public void setMileage(double mileage) {
			this.mileage = mileage;

		}

		public double getMileage() {
			return mileage;
		}

		public String toString() {
			return "SportsCAR:" + getvno() + " " + getmodel() + " " + price + " " + noofGears + " " + getfuelType()
					+ " " + maxspeed + " " + mileage;
		}
	}

	public class MultiLevelDemo {
		public static void main(String[] args) {
			//Car c = new Car();
			//System.out.println(c);
			System.out.println("_______-");
			Car1 c1 = new Car1(101, "Honda", 67000, 4, "Petrol");
			 System.out.println(c1);
			 SportsCar s1=new SportsCar(902,"x1",2500000,6,"Petrol",400,40);
			 System.out.println(s1);
		}
	}



