import java.util.Scanner;

public class Factorial {
	
	public static Integer factorialWithLoop(Integer number)
	{
		Integer factorial = 1;
		for (int i = number; i > 1; i--) {
			factorial = i * factorial;
		}
		
		return factorial;
	}
	
	public static Integer factorialWithRecursion(Integer number)
	{
		if(number <= 1)
		{
			return 1;
		}
		
		return number * factorialWithRecursion(number - 1);
				
	}
	
	public static void fibonacciWithLoop(Integer number)
	{
		int f1 = 0 , f2 = 1;
		int f3;
		int i = 0;
		
		System.out.print(f1+", ");
		System.out.print(f2+", ");
		
		while(i < number - 2)
		{
			f3 = f1 + f2;
			
			System.out.print(f3+", ");
			
			f1 = f2;
			f2 = f3;
			
			i++;
		}
	}
	
	public static int fibonacciWithRecursion(Integer number)
	{
		if(number == 0)
		{
			return 0;
		}
		else if (number == 1 || number == 2)
		{
			return 1;
		}
		
		return fibonacciWithRecursion(number-2) 
				+ fibonacciWithRecursion(number - 1);
	}

	
	public static void main(String[] args) 
	{
		System.out.println("Please ennter the number ");
		
		Integer number = 10;
		
		System.out.println("\nFactorial of "+number+" with Loop = "+factorialWithLoop(number));
		
		System.out.println("Factorial of "+number+" with Recursion = "+factorialWithRecursion(number));
		
		System.out.println("\nFibonacci Series for "+number+" with Loop is = ");
		fibonacciWithLoop(number);
		
		System.out.println("\n\nFibonacci Series for "+number+" with Recursion is = ");
		for (int i = 0; i < number; i++) 
		{
			System.out.print(fibonacciWithRecursion(i)+", ");
		}
	}

}
