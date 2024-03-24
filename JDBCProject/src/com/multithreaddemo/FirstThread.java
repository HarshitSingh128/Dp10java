package com.multithreaddemo;

public class FirstThread extends Thread {
	public void run() {
		for (int i = 1; i <= 3; i++) {
			String s = Thread.currentThread().getName();
			System.out.println("Cricket is" + s);
			try {
				Thread.sleep(3000,99999);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
		FirstThread f = new FirstThread();//new
		f.setName("Sports");
		f.start();//runnable
		
		FirstThread f1= new FirstThread();
		f1.setName("good game");
		f1.start();

	}

}
