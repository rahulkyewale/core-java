package com.study.multithreading.prodConsum;

import java.util.LinkedList;

public class PC 
{
	LinkedList<Integer> list = new LinkedList<>(); 
    int capacity = 2;
	
    public void produce() throws InterruptedException
    {
    	int value = 0;
    	while(true)
    	{
    		synchronized (this) 
        	{
    			while(list.size() == capacity)
            	{
            		wait();
            	}
    			
    			System.out.println("Producer produced-"+value);
    			
    			list.add(value++);
    			
    			notify();
    			
    			Thread.sleep(1000);
    		}
    	}
    }
    
    public void consume() throws InterruptedException
    {
    	while(true)
    	{
    		synchronized (this) 
        	{
    			while(list.size() == 0)
            	{
            		wait();
            	}
    			
    			int value = list.removeFirst();
    			System.out.println("Consumer consumes-"+value);
    			
    			notify();
    			
    			Thread.sleep(1000);
    		}
    	}
    }
}
