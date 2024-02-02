package Com.demo.staticmethod;

public class Item {
	private int itemid;
	private String iname;
	private double cost;
	
	static  double discount;
	static String brand;
	static int icount=0;
	static {
		System.out.println("***My grocery shop***");
		System.out.println("Item add");
		icount++;
	}
	static {
		System.out.println("Doscount on all items");
		discount=0.1;
		brand="Patanjali";
		
	}
	{
	System.out.println("In instance block");
	brand="Nestle";
	System.out.println("Item added....");
	icount++;
	}
	Item(){
		brand="saffola";
	}
	Item(int itemid,String iname,double cost){
		this.itemid=itemid;
		this.iname=iname;
		this.cost=cost;
	}
	public void setItemid(int itemid) {
		this.itemid=itemid;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemname(String iname) {
		this.iname=iname;
		
	}
	public String getItemname() {
		return iname;
		
	}
	public void setcost(double cost)
	{
		this.cost=cost;
	}
	public double getcost() {
		return cost;
	}
	public String toString() {
		return "Item:"+itemid+" "+iname+" "+cost;
		
	}
	
	public static void main(String[] args) {
		System.out.println("In main method");
		
	}

}
