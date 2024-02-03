package com.demo.interfacedemo;
//here we are showing Teight coupling because the class  box are depedent to volume and vice versa  
//we can not edit in anyclass because they are totaly bound with each other it shows tightcoupling .
//tightcopling are  show in class not interface 

//Task 4>>
//Create a code to show how abstract class can have tight coupling issues
class Box{
	public int volume;
	
	Box(int lenght,int width,int height){
		this.volume=lenght*width*height;
		
	}
	void show() {
		System.out.println(volume);
	}
}

public class Volumetightcoupling {

	public static void main(String[] args) {
		Box b=new Box(5,5,4);
		b.show();
	
	

	}

}
