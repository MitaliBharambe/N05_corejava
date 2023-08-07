package org.tnsif.interfacedemo;
//driver class
//Program to demonstrate on an interface
public class InterfaceExecutor {

	public static void main(String[] args) {
		//we cannot instantiate an interface 
		// DebitCard d= new DebitCard();
		SBIDebitCard d= new SBIDebitCard();
		d.displayCardDetails();
		//we can call default method of an interface using the obj. of implements class
		d.display();
		/* Print() is a static method inside an interface, to call print() method, we have to use
		 *interface name.method name() ;*/
		DebitCard.print();
		
		CheesePopcorn c= new CheesePopcorn();
	    c.displayReceipe();
	    
	    Person p = new Person();
	    p.showDrinkName() ;   
	}

}
