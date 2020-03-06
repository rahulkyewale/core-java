package com.study.multithreading.prodConsum;

public class Consumer implements Runnable
{
	private PC pc;
	
	public Consumer(PC pc)
	{
		this.pc = pc;
	}
	
	@Override
	public void run() 
	{
		try {
			pc.consume();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
