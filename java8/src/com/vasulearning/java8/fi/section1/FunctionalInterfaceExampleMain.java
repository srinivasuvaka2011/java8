package com.vasulearning.java8.fi.section1;

public class FunctionalInterfaceExampleMain {

	public static void main(String args[]) {
		
		/**** Notes **** */
		
		/***
		 * From java 8 onwards, if an interface has single abstract method, then we can call that interface 
		 * as functional interface. We can write l
		 */
		
		 MyFunctionalInterface myFunctionalInterface = () -> System.out.println("welcome");
		 
		 myFunctionalInterface.display();
		 
		 /**
		  * Question in mind: What happens if i define one more abstract method in MyFunctionalInterface interface?
		  * 
		  * Answer: Then we can't call it as functional interface and it just a normal interface. Also, we can't write lambda expression for it.
		  * 
		  * Just uncomment scrollMessage(); in interface and see above lambda expression is giving any errors or not.
		  */
		 
		 
		 /**
		  * Question in mind: I have already a functional interface in my application and also it has implementations through lambda expression somewhere 
		  * in my application. If someone adds (they don't know it as functional interface) new abstract method, then it will break all my interface implementations and 
		  * will get compilation error. is there any way to restrict adding one or more abstract methods to my functional interface?
		  * 
		  * Answer: Yes. We can restrict adding one or more abstract methods to an interface by annotating with @FunctionalInterface. 
		  * If you annotate your interface with @FunctionalInterface, then it will allows only single abstract method in it. If someone try to add one more abstract method,
		  * then it will show compilation error on interface.
		  * 
		  * When you annotate your interface with above annotation, then that should have single abstract method.
		  */
		 
		 /**
		  * Question in mind: What happens if my functional interface extends another interface
		  * 
		  * Answer: When your functional interface extends any other interface, until it satisfies single abstract method rule , it won't give you compilation error and 
		  * can write lambda expression.
		  * 
		  * Let us see simple examples in our next section.
		  */
		 
		  
		  
	}
}
