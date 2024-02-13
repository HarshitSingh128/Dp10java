package com.demo.enumbasic;

public enum MovieSeat {
	STANDARD(300),PREMIUM(400),RECLINER(650);
     
	int price;
	private MovieSeat(int price) {
		this.price=price;
	}
}
