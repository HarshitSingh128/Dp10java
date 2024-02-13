package com.demo.enumbasic;
enum Season{SUMMER,WINTER,MONSOON};
public class EnumDemo1 {

	public static void main(String[] args) {
		
		Season s=Season.MONSOON;
		switch(s) {
		case SUMMER:System.out.println("Cotton Clothes");
		break;
		case WINTER:System.out.println("Wollen  Clothes");
		break;
		case MONSOON:System.out.println("Umbrella and Raincoat");
		break;
		default :
			System.out.println("error");
		}

	}

}
