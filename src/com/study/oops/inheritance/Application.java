package com.study.oops.inheritance;

public class Application {

	public static void main(String[] args) 
	{
		TestAbstract test = new TestAbstract(10) 
		{
		};
		
		test.testchange();
		
		System.out.println(test.test);

	}

}
