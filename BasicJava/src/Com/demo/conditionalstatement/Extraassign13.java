package Com.demo.conditionalstatement;

import java.util.Scanner;

public class Extraassign13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double temprature;
		System.out.println("Enter temprature=");
		temprature=sc.nextDouble();
		if(temprature<0) {
			System.out.println("Freezing weather=");
		}
		else if(temprature>0 && temprature<10) {
			System.out.println("Very cold weather=");
		}
		else if(temprature>10 && temprature<20) {
			System.out.println("Cold weather=");
		}
		else if(temprature>20 && temprature<30) {
			System.out.println("Normal temprature=");
		}
		else if(temprature>30 && temprature<40) {
			System.out.println("Its Hot=");
		}
		else if(temprature==40) {
			System.out.println("Very Hot=");
		}
		else {
			System.out.println(" Please Heater ON=");
			
		}
	}

}
