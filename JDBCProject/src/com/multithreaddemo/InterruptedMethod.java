package com.multithreaddemo;

class Document implements Runnable{
	Thread t;
	
	Document(){
		t=new Thread(this,"Document");
		t.start();	
	    t.interrupt();	
	}

	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			String s=Thread.currentThread().getName();
			if(i==3) {
				try {
					Thread.sleep(2000);
				}catch(InterruptedException e) {
					System.out.println("InterruptedException handled");
				}
			}
			System.out.println(s+i+"Printed");
			
		}
		
	}
	
}
public class InterruptedMethod {

	public static void main(String[] args) {
		//Document d1=new Document();
		Runnable r=new Document();
	}

}
