package Com.methodoverriding;
//Task2> 
//Create a class Game having the method rules() and noOfPlayers(). Create a class BasketBall, Soccer, Cricket
//which are child class of Game. Override the above methods and use dynamic method dispatch
//to show thw rules and noofPlayers according to the object passed

class Game {
	void rule() {
		System.out.println("Nobody going to sit ");
	}

	void noofPlayer() {
		System.out.println("There are only 11 players in the game");
	}
}

class BasketBalls extends Game {
	void rule() {
		System.out.println("Nobody is to siting zone");
	}

	void noofPlayer() {
		System.out.println("there are only 8 players in the game");
	}

}

class Soccer extends Game {
	void rule() {
		System.out.println("nobody is going parling zone");
	}

	void noofPlayers() {
		System.out.println("there are 11 players in the game");
	}

}

class Cricket extends Game {
	void rule() {
		System.out.println("nobody is going standing zone");
	}

	void noofPlayers() {
		System.out.println("there are 11 players in the game");
	}

}

public class GamingInfo {

	public static void main(String[] args) {
		Game g;
		g = new Cricket();
		g.rule();
		g.noofPlayer();

	}

}
