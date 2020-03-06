package com.study.multithreading.prodConsum;

public class Producer implements Runnable
{
	private PC pc;
	
	public Producer(PC pc)
	{
		this.pc = pc;
	}
	
	@Override
	public void run() 
	{
		try {
			pc.produce();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
