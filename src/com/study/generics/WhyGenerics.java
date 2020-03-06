package com.study.generics;

import java.util.ArrayList;
import java.util.List;

public class WhyGenerics {

	private static void withoutGenerics()
	{
		List listNonGen = new ArrayList();
		
		listNonGen.add(10);
		listNonGen.add(20);
		listNonGen.add("Thirty");
		
		for (Object element : listNonGen) 
		{
			// Class cast Exception when doing for "Thirty"
			try
			{
				Integer test = (Integer) element;
				System.out.println(test);
			}
			catch (ClassCastException e) 
			{
				System.out.println(e);
			}
		}
	}
	
	private static void withGenerics()
	{
		List<Integer> listGen = new ArrayList<Integer>();
		
		listGen.add(10);
		listGen.add(20);
		listGen.add(30);
		
		// Now Compiler doesn't allow this
		//listGen.add("Ten");
		
		for (Integer element : listGen) 
		{
			// Type Casting is not required because it is already specified in List genrics
			Integer test = element;
			System.out.println(test);
		}
	}
	
	
	public static void main(String[] args) 
	{
		withoutGenerics();
		withGenerics();
	}

}
