package com.demo.containmentdemo2;

public class GroceryShop {
	static void findSupplier(Supplier st[],String Itemname) {
		for(Supplier s:st) {
			for(Item i:s.getItems()) {
				if(i.getIname().equals(Itemname)) {
					System.out.println(s.getSid()+" "+s.getSname()+" "+s.getSphonenub());
				}
			}
		}
	}
	
			

	public static void main(String[] args) {
		Supplier sups[]=new Supplier[3];
		Item[] i1=new Item[3];
		i1[0]=new Item(1,"rice",35);
		i1[1]=new Item(2,"patato",50);
		i1[2]=new Item(3,"Dal",60);
		
		for(Supplier s:sups) {
			System.out.println("Supplier:"+"Id-"+s.getSid());
		}

	}

}
