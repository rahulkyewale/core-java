package com.study.multithreading.prodConsum;

public class Application {

	public static void main(String[] args) throws InterruptedException 
	{
		final PC pc = new PC();
		
		Thread t1 = new Thread(new Producer(pc));
		Thread t2 = new Thread(new Consumer(pc));
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}

}
