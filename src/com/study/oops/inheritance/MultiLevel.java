package com.study.oops.inheritance;

class A 
{
	public A()
	{
		System.out.println("Inside A");
	}
	
	protected static void X()
	{
		System.out.println("Inside X");
	}
	
	protected void Y()
	{
		System.out.println("Inside Y");
	}
}

class B extends A
{
	public B()
	{
		System.out.println("Inside B");
	}
}

class C extends B 
{
	public C()
	{
		this(10);
		System.out.println("Inside C");
	}
	
	public C (int a)
	{
		System.out.println("Inside C parameterized. this() or super() only one can use at a time in constructor");
	}
	
	protected static void X()
	{
		System.out.println("Inside C.X");
	}
}

public class MultiLevel {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException 
	{
		A a = new A(); System.out.println("");
		B b = new B(); System.out.println("");
		C c = new C(); System.out.println("");
		
		A upCast = b;
		System.out.println("");
		
		B downCast = (B) upCast;
		System.out.println("");
		
		a.X();
		a.Y();
		
		b.X();
		b.Y();
		
		c.X();
		c.Y();
	}
}
