package com.multithreaddemo;


class Bake implements Runnable{

	@Override
	public void run() {
		String s=Thread.currentThread().getName();
		System.out.println("Baking"+" "+s);
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			System.out.println(e);
		}
		
	}
	
}
public class ThreadUsingRunnable {

	public static void main(String[] args) throws InterruptedException       {
		System.out.println("main method");
		Runnable r;
		r=new Bake();
		Thread t=new Thread(r,"Vanila cake");
		t.start();
		t.join();
		Thread t1=new Thread(r,"Finished");
		t1.start();
		t1.join();
		
		Thread t2=new Thread(r,"Ready to delivery");
		t2.start();
		t2.join();

	}

}
