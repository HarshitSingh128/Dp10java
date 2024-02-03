package com.demo.revision;
//Create class Fish { String name , int gills  } . Class Fish has method void swim() which has some default implementation.
//Create two subclasses of Fish , GoldFish and Whale.
//Override swim method in GoldFish by changing access modifier and Override in Whale class by changing its return type.
class Fish{
	String name;
	int gills;
	Fish(){
		
	}
	Fish(String name,int gills){
		this.name=name;
		this.gills=gills;
		
	}
	void swim() {
		System.out.println("Default IMplemanatation");
	}
}
class Goldfish extends Fish{
	public void swim() {
		System.out.println("I am a Goldfish");
		// we are only increasing the access modifier
	}
}
class Whale extends Fish{
	public void swim() {
		
		//return "I am a Whale";
		//we can not use any return type because this method are overridden
		System.out.println("I am a Whale");
		
	}
}


public class FishInfo {

	public static void main(String[] args) {
		Fish f;
		f=new Fish();
		f.swim();
		f=new Goldfish();
		f.swim();
		f=new Whale();
		f.swim();
	
	}

}
