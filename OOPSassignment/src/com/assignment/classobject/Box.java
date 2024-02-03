package com.assignment.classobject;

import java.util.Scanner;

public class Box {
	int lenght = 10;
	int width = 20;
	int height = 30;
	double volume = lenght * width * height;

	public void displayvolume() {
		System.out.println("Volume is =" + volume);
	}

	public static void main(String[] args) {

		Box b1 = new Box();
		b1.displayvolume();
	}

}
