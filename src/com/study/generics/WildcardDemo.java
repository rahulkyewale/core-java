package com.study.generics;

//Java program to demonstrate Upper Bounded Wildcards 
import java.util.Arrays; 
import java.util.List; 

class WildcardDemo 
{ 
	public static void main(String[] args) 
	{ 
		
		//Upper Bounded Integer List 
		List<Integer> list1= Arrays.asList(4,5,6,7); 
		
		//printing the sum of elements in list 
		System.out.println("Total sum is:"+sum(list1)); 

		//Double list 
		List<Double> list2=Arrays.asList(4.1,5.1,6.1); 
		
		//printing the sum of elements in list 
		System.out.println("Total sum is:"+sum(list2));
		
		List<Number> list3 = Arrays.asList(10, 11, 12, 13);
		
		// super allowed
		printOnlyIntegerClassorSuperClass(list3);
		
		// same allowed
		printOnlyIntegerClassorSuperClass(list1);
		System.out.println("Total sum is:"+sum(list3));
	} 

	// UpperBound
	private static double sum(List<? extends Number> list) 
	{ 
		double sum=0.0; 
		for (Number i: list) 
		{ 
			sum+=i.doubleValue(); 
		} 

		return sum; 
	} 
	
	//LowerBound
	public static void printOnlyIntegerClassorSuperClass(List<? super Integer> list) 
    { 
        System.out.println(list); 
    } 
}


