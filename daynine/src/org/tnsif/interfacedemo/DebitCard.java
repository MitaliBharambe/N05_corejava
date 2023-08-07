package org.tnsif.interfacedemo;

public interface DebitCard {
/*by default all the variable inside an interface is public static final and 
	if it is final them we must have to initialize value for that variable*/
	long cardno=4596624444456l;
	/*we can't use concrete method inside an interface by default, method inside an interface is an abstract */
	void displayCardDetails();
	//default method and static method is an new feature of java8 which can we use inside an interface
	default void display()
	{
		System.out.println("Default method");
	}
	
	static void print()
	{
		System.out.println("Static method");
	}
}
