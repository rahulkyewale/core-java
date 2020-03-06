package com.study.oops.polymorphism;

//A Java program to illustrate Dynamic Method 
//Dispatch using hierarchical inheritance 
class A 
{ 
	int x = 10;
	
	void m1() 
	{ 
		System.out.println("Inside A's m1 method"); 
	} 
} 

class B extends A 
{ 
	int x = 20;
	
	// overriding m1() 
	void m1() 
	{ 
		System.out.println("Inside B's m1 method"); 
	} 
} 

class C extends A 
{ 
	int x = 30;
	
	// overriding m1() 
	void m1() 
	{ 
		System.out.println("Inside C's m1 method"); 
	} 
} 

//Driver class 
class RunTimePoly
{ 
	public static void main(String args[]) 
	{ 
		// object of type A 
		A a = new A(); 

		// object of type B 
		B b = new B(); 

		// object of type C 
		C c = new C(); 

		// obtain a reference of type A 
		A ref; 
		
		// ref refers to an A object 
		ref = a; 

		// calling A's version of m1() 
		ref.m1(); 
		// printing A's member x
		System.out.println(ref.x);

		// now ref refers to a B object 
		ref = b; 

		// calling B's version of m1() 
		ref.m1(); 
		// printing A's member x bcs data members will not be overriden
		System.out.println(ref.x);

		// now ref refers to a C object 
		ref = c; 

		// calling C's version of m1() 
		ref.m1(); 
	} 
}
