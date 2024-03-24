package com.multithreaddemo;

public class BerthBooking implements Runnable {
int available=2;
int wanted;
int count=0;
BerthBooking(int wanted){
	this.wanted=wanted;
}
@Override
public synchronized void run() {
	System.out.println("Please book your berths");
	String s=Thread.currentThread().getName();
	if(available>=wanted) {
		System.out.println("Available Berth"+available);
		System.out.println("booking berth for"+s);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Congrats Your berth is booked");
		available=available-wanted;
	}
	else {
		System.out.println("Sorry no berth available");
		count++;
	System.out.println("Waiting no"+count);
			
	}
	
}
	public static void main(String[] args) {
		BerthBooking b=new BerthBooking(1);
		
		Thread t1=new Thread(b,"First Person");
	t1.start();
	Thread t2=new Thread(b,"Second Person");
	t2.start();
	
	}



}
