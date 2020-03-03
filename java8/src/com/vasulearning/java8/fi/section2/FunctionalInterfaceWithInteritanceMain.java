package com.vasulearning.java8.fi.section2;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.vasulearning.java8.fi.section2.B;

class FunctionalInterfaceWithInteritanceMain {

		public static void main(String args[]) {
		 /*
		  * i have an interface A annotated with @FunctionalInterface and i defined single abstract method m1();
		  * 
		  * Now i created another functional interface B by extending to A and didn't define any method in interface B
		  *
		  * is B valid functional interface?
		  */
		 
		  B b = () -> System.out.println("is B valid functional interface?. A) Yes it is valid");
		  
		  b.m1();
		 
		 /*
		  * Why B is valid functional interface though it doesn't have any single abstract method in it?
		  * 
		  * Answer) B has single abstract method by inheriting from interface A.
		  */
		  
		  /*
		   * Now i will create a functional interface C by extending A. And i will add single abstract method m1() in C.  
		   *
		   * is C valid functional interface?
		   * 
		   */
		  
		  C c = () -> System.out.println("is C valid functional interface?. A) Yes it is valid");
		  
		  c.m1();
		  
		  /*
		   * Why C is valid functional interface? it has two abstract methods in it right. one is by inheriting from interface A and another one is it's already one abstract 
		   * method in it.
		   * 
		   * Answer) No C has only single abstract method as per the inheritance mechanism. abstract methods in A and in C have same method name and signature. So
		   * when C extends A, it is overriding abstract method m1() in A. So C has only single abstract method and it is valid functional interface
		   */
		  
		  /*
		   * Change method name from m1() to m2() in interface C and see what happens.
		   */
		
		  /**
		   *  In java 8, we have already have some predefined functional interfaces
		   *  
		   *  Example: 
		   *   Predicate<String> p;
		  	   Function<String,String> f;
		  	   Consumer<String> c;
		  	   BiConsumer<String,String> bi;
		   */
		 
		
	}

}
