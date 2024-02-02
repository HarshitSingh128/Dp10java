package Com.abstractdemo;
abstract class Bike{
	//instance variables
	private int id;
	private String name;
	private double cost;
	
	//static variables
	static String brandname;
	static float discount;
	
	static {
		brandname="Honda";
	}
	//constructor: "to initialize instance variable
	//using super in child class 
	Bike(){
		
	}
	Bike(int id ,String name,double cost){
		this.id=id;
		this.name=name;
		this.cost=cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public static String getBrandname() {
		return brandname;
	}
	public static void setBrandname(String brandname) {
		Bike.brandname = brandname;
	}
	
	//abstract and final cannot come together
	//abstract and static cannot come together
	abstract void description();
	//static method
	public static float getDiscount() {
		return discount;
	}
	public static void setDiscount(float discount) {
		Bike.discount=discount;
		
	}
	//final method
	final void display() {
		System.out.println("Brand name:+brandname");
		System.out.println("Discount on all bikes :"+Bike.discount+"%");
		System.out.println("====================");
		System.out.println("Id:+id");
		System.out.println("Model:"+name);
		System.out.println("cost:"+cost);
		System.out.println("Discount cost:"+(cost-((discount/100)*cost)));
	}
	
	
}
class BasicBike extends Bike{
	private float avg;
	public BasicBike(){
		super();
		
	}
	public BasicBike(int id,String name,double cost,float avg) {
		super(id,name,avg);
		this.avg=avg;
		
	}
	@Override
	void description() {	
		System.out.println("This is normal bike");
		System.out.println("Number og gears : 4");
		System.out.println("Average:"+avg);
		
	}
	
}
class SportsBike extends Bike{
	private int gears;
	private float speed;
	public SportsBike() {
		super();
		
	}
	public SportsBike(int id,String name,double cost,int gears,float speed) {
		super(id,name,cost);
		this.gears=gears;
		this.speed=speed;
	}
	@Override
	void description() {
		System.out.println("This is Sports bike");
		System.out.println("Number og gears:"+gears);
		System.out.println("Speed:"+speed);
		
	
	}
	
}

public class Abstractdemo2 {

	public static void main(String[] args) {
		Bike b;
		Bike.setDiscount(20);
		b=new SportsBike(101,"Buccati",108000,6,300);
		b.display();
		System.out.println("__________--");
		b.description();
		
		System.out.println("=====================");
		b=new BasicBike(101,"Splender",50000,20);
		b.display();
		b.description();
		

	}

}
