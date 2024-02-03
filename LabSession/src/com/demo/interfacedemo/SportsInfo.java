package com.demo.interfacedemo;

//Task3>>
//Write a Java program to create an interface Playable with a method play() that takes no arguments 
//and returns void. 
//Create three classes Football, Volleyball, and Basketball that implement the Playable interface 
//and override the play() method to play the respective sports.
interface Playable {
	void play();

}

class Football implements Playable {

	@Override
	public void play() {
		System.out.println("There are  11 players in one team");

	}

}

class Volleyball implements Playable {

	@Override
	public void play() {
		System.out.println("There are 5 players in one team ");

	}

}

class Basketball implements Playable {

	@Override
	public void play() {
		System.out.println("there are 12 players in one team");

	}

}

public class SportsInfo {

	public static void main(String[] args) {
		Playable p;
		p = new Football();
		p.play();
		p = new Volleyball();
		p.play();
		p = new Basketball();
		p.play();

	}

}
