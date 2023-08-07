package org.tnsif.interfacedemo;
//implementable class for a functional interface
public class CheesePopcorn implements Popcorn{

	@Override
	public void displayReceipe() {
		System.out.println("take popcorn packets"
	              +"from shop and cook it in high"
				  +"fire inside a cooker");
	}

}
