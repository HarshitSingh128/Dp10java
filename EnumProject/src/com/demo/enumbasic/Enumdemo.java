package com.demo.enumbasic;
class CinstantDirec{
	static final String NORTH="NORTH";
	static final String SOUTH="SOUTH";
	static final String EAST="EAST";
	static final String WEST="WEST";
	
}
public class Enumdemo {
	public enum Direction{NORTH,EAST,WEST,SOUTH};

	public static void main(String[] args) {
		Direction d1= Direction.NORTH;
		System.out.println(d1);
		
		Direction d2=  Direction.NORTH;
		if(d1==d2) {
			System.out.println("Equal");
		}
		
		if(d1.equals(d2)) {
			System.out.println("Equal");
		}
		
		//iterate the enum
		System.out.println("========================");
		for(Direction d:Direction.values()) {
			System.out.println(d);
		}
		
		System.out.println("============================================");
       
		 System.out.println(Direction.valueOf("NORTH"));//it gives value whatever you pass inside but we have to declare as enum
		 System.out.println(Direction.SOUTH.ordinal());//it gives index
	}

}
