//Driver class
//Program to demonstrate on default and parameterized constructor
package org.tnsif.classandobject;

public class CitizenExecutor {

	public static void main(String[] args) {
		Citizen c=new Citizen ();
		
		Citizen c1=new Citizen("Adult",221144556677L,"Female","nashik");
		System.out.println(c1);
	}
	
}