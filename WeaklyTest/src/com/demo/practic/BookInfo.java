package com.demo.practic;

import java.util.Scanner;

class Book{
private int bookid;
private String bookname;
private double bookprice;
private  int bookqty;
double discprice;

Book(){
}
Book(int bookid,String bookname,double bookprice,int bookqty){
this.bookid=bookid;
this.bookname=bookname;
this.bookprice=bookprice;
this.bookqty=bookqty;

}
public void setBookid(int bookid){
this.bookid=bookid;
}
public int getBookid(){
return bookid;
}
public void setBookname(String bookname){
this.bookname=bookname;
}
public String getBookname(){
return bookname;
}
public void setBookprice(double bookprice){
this.bookprice=bookprice;
}
public double getBookprice(){
return bookprice;
}
public void setBookqty(int bookqty){
this.bookqty=bookqty;
}
public int getBookqty(){
return bookqty;
}
public double caltotalPrice(){
double totalprice=bookprice*bookqty;
return totalprice;
}
public double calDiscount(double discount){
double  total= caltotalPrice();
discprice=(total-(total/100)*discount);
return discprice;
}
public String toString(){
return "Book:"+bookid+" "+bookname+" "+bookprice+"BookQuantity "+bookqty+"Totalprice"+caltotalPrice();
}
}
public class BookInfo {
	static Scanner sc=new Scanner(System.in);
	public static void enterDetails(Book b){
	System.out.println("enter Book id:");
	b.setBookid(sc.nextInt());
	System.out.println("enter Book name:");
	b.setBookname(sc.next());
	System.out.println("Enter Book price:");
	b.setBookprice(sc.nextDouble());
	System.out.println("Enter Book qty");
	b.setBookqty(sc.nextInt());
	 }

	public static void main(String[] args) {
		Book b1=new Book();
		enterDetails(b1);
		System.out.println(b1);
		System.out.println("Amount to pay after diducted the amount"+b1.calDiscount(20));
		// TODO Auto-generated method stub

	}

}
