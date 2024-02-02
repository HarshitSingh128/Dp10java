package Com.demo.constructor;

//Task1: Create a class Book with the following details : id, name , price, category
//Create  methods to calDiscount(), compareDiscCost() 
//Create 4 objects of books by taking the user input and then compare the cost of any 2 books

public class Book {
	private int id;
	private String name;
	private int price;
	private double discPrice;
	private int bookqty;
	Book(){
	
	}
	
	 
	Book(int id,String name,int price,String category,int bookqty ){
		this.id=id;
		this.name=name;
		this.price=price;
		this.bookqty=bookqty;
		
	}
	public void setBookId(int id ) {
		this.id=id;
	}
	public int getBookId() {
		return id;
	}
	public void setBookName(String name) {
		this.name=name;
	}
	public String getBookname() {
		return name;
	}
	public void setBookPrice(int price) {
		this.price=price;
	}
	public int getBookPrice() {
		return  price;
	}
	public void setBookqty(int bookqty) {
		this.bookqty=bookqty;
	}
	public int getBookqty() {
		return bookqty;
	}
	public double calTotalprice() {
		double totalprice=bookqty*price;
		return totalprice;
	}
	public double calDiscountPrice(double discount) {
		double Total=calTotalprice();
		discPrice=Total-((discount/100)*Total);
		return discPrice;
	}
	public void compairCost(Book b1) {
		if(this.discPrice==b1.discPrice)
			System.out.println("Both have same cost");
		else if(this.discPrice>b1.discPrice)
			System.out.println(this.getBookname()+"has higher price:"+b1.getBookname());
	
	else
		System.out.println(b1.getBookname()+"has higher price"+this.getBookname());
	}	
	public String toString() {
		return "BOOK"+id+"  "+name+" "+price+" Total"+calTotalprice();
	}
	
	

}
