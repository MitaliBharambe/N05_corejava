//Driver class
//Program to demonstrate on class and objects
package org.tnsif.classandobject;

public class SandwichExecutor {

	public static void main(String[] args) {
		
		
		//Object creation 
		Sandwich s=new Sandwich();
		s.breadType="Brown Bread";
		s.noofslice=4;
		//method call
		s.display();

	}

}