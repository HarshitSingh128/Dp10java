package com.multithreaddemo;

class DaemonMain1 extends Thread{
	DaemonMain1(){
		System.out.println("hi");
	}
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon");
		}
		else {
			System.out.println("Normal user thread");
		}
	}
}
public class Daemonthreaddemo {

	public static void main(String[] args) {
		DaemonMain1 d=new DaemonMain1 ();
		d.setDaemon(true);
		d.start();

	}

}
