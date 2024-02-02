package Com.demo.constructor;

public class Item {
	private int itemid;
	private String itemname;
	private int itemcost;
	private int itemqty;
	private double discPrice;
	Item(){
	}
	Item(int itemid,String itemname,int itemcost,int itemqty){
		this.itemid=itemid;
		this.itemname=itemname;
		this.itemcost=itemcost;
		this.itemqty=itemqty;
		
		
	}
	public void setItemid(int itemid) {
		this.itemid=itemid;
		
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemname(String itemname) {
		this.itemname=itemname;
		
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemcost(int itemcost) {
		this.itemcost=itemcost;
		
	}
	public int getItemcost() {
		return itemcost;
	}
	public void setItemqty(int itemqty ) {
		this.itemqty=itemqty;
	}
	public int getItemqty() {
		return itemqty;
	}
	public double calTotalPrice() {
		double totalprice=itemqty*itemcost;
		return totalprice;
	}
	public double calDiscountPrice(double discount) {
		double total=calTotalPrice();
		discPrice=total-((discount/100)*total);
		return discPrice;
		
	}
	public void compairCoast(Item i2) {
		if(this.discPrice==i2.discPrice)
			System.out.println("Both have same cost ");
		else if(this.discPrice>i2.discPrice)
			System.out.println(this.getItemname()+"has higher cost"+i2.getItemname());
		else 
			System.out.println(i2.getItemname()+"has higher cost"+this.getItemname());
		
	}
	public String toString() {
		return "Item:"+itemid+" "+itemname+" "+itemcost+"Total:"+calTotalPrice(); 
	}
	}
	


