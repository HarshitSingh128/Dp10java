package Com.demo.staticmethod;

public class TestItem {

	public static void main(String[] args) {
		System.out.println(Item.discount);
		System.out.println(Item.brand);
		
		Item i1=new Item(1,"sugar",78);
		System.out.println(Item.brand);
		System.out.println(i1);
		
		Item i2=new Item();
		//System.out.println(Item.brand);
		System.out.println(Item.brand);
		System.out.println("Number of items:"+Item.icount);
		

	}

}
