package com.vasulearning.java8.lambda.section2;

import com.vasulearning.java8.lambda.section2.MyInterface;

public class WithLambdaExampleMain {

	public static void main(String args[]) {
		
		/*
		MyInterface myInterface = new MyInterface() {
			@Override
			public void display() {
				System.out.println("Welcome");
			}
		};
		*/
		
		//now we can see how lambda express replaces above all lines of code with single statement
		MyInterface myInterface = () -> System.out.println("Welcome:");
		myInterface.display();
		
		
		/**** - Notes ****/
		/**
		 * 1. It enables functional programming in java 8
		 * 2. Write more readable, concise and maintainable code
		 * 3. Supports to use APIs very easily and effectively
		 * 
		 *  Let us see how to remember syntax of lambda
		 *  
		 *  In above interface method remove method name, return type and access modifier
		    then method will look like as below
		    () {
		      System.out.println("Welcome");
		    }
		    
		    Now after method parenthesis add '->' (which indicates to compiler this is lambda expression
		    
		    () -> {
		    	System.out.println("Welcome");
		    }
		    
		   Question in mind: In above example, there is no open and close brace, but here why he added open
		     and closed brace?
		    
		   Answer: In Lambda syntax if there is only one line of statement, then we no need to keep that statement
		   in '{' and '}' braces.
		   
		   Question in mind: Does lambda expression supports method with arguments?
		   
		   Answer: Yes, lambda expression can also take arguments
		   
		   Let us see that example
		   
		 */
		
		Adder adder = (int a, int b) -> a + b;
		
		int result = adder.add(10,20);
		
		System.out.println("Addition result: "+result);
		
		/***** Notes  ***** */
		
		/**
		 * Question in mind: add method has return type but we are not returning any value in above lambda expression. Then how it is working?
		 * 
		 * Answer: When a method has return type and if we are providing implementation in single line then we no need to keep return type. Java compiler can understand
		 * that type of the evaluated expression and can return it.
		 * 
		 * Question in mind: Can we add our own return type
		 * 
		 * Answer: Yes. we can do that. But we should provide open and close braces, though it is single line of statement as shown in below example
		 * 
		 */
		
		// Adder adder = (a, b) -> return a + b; //throws compilation error
		
		Adder adder1  = (int a, int b) -> { return a + b; 
		};
		
		int result1 = adder1.add(10,20);
		
		System.out.println("Addition result: "+result1);
		
		/**** Notes **** */
		
		/**
		 * Let us see other valid syntaxes
		 */
	
		Adder adder2 = (a, b) -> a + b;
		
		/**
		 * Even though we remove data types from the arguments, java compiler can understand the data type for method arguments. 
		 * So it won't give any compilation error.
		 */
		
		// Adder adder3 = (int a, b) -> a + b; // this is not valid. Either we should remove all data types or provide all data types.
		
		
		/**** Notes ****/
		
		/**
		 * Question In mind: Can we write lambda expression for every method in an interface or a class?
		 * 
		 * Answer: No. We can write lambda expression for only functional interface methods
		 * 
		 * Let us see what is functional interface in our next chapters
		 */
		
	}
	
}
