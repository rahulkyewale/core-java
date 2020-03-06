package com.study.oops.inheritance;

public abstract class TestAbstract 
{
	protected Integer test;

	public TestAbstract(Integer test) {
		super();
		this.test = test;
	}
	
	public void testchange()
	{
		test = 40;
	}
}
