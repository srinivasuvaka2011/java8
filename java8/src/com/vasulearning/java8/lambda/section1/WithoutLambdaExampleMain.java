package com.vasulearning.java8.lambda.section1;

/**
 * This class explains how we can implement interface methods
 * 1. Anonymous inner class
 * 2. a class by implementing an interface
 * 
 * @author srinivasu
 *
 */
public class WithoutLambdaExampleMain {

	public static void main(String args[]) {
		//anonymous inner class
		
		MyInterface myInterface = new MyInterface() {
			@Override
			public void display() {
				System.out.println("Welcome");
			}
		};
		
		myInterface.display();
		
		MyInterface myInterface2 = new MyInterfaceImpl();
		myInterface2.display();
	}
	
	/*
	 * a class by implementing an inner class
	 */
	private static class MyInterfaceImpl implements MyInterface {

		@Override
		public void display() {
			System.out.println("Welcome:");
		}
		
	}
}
