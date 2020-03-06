package com.study.multithreading;

public class ThreadCreation extends Thread {
	
	public static void main(String[] args) {
		ThreadWithClass t1 = new ThreadWithClass();
		
		t1.start();
		
		ThreadWithInterface obj = new ThreadWithInterface();
		Thread t2 = new Thread(obj);
		
		t2.start();
	}

}

class ThreadWithClass extends Thread
{
	public void run()
	{
		System.out.println("Thread with Class is running");
	}
}

class ThreadWithInterface implements Runnable
{

	@Override
	public void run() 
	{
		System.out.println("Thread with Interface is running");
	}
	
}