package org.tnsif.instanceofdemo;
//program to demonstrate on instance of operator

class Flower{
	String name= "Rose";
}

class Rose extends Flower
{
   String color="Red";	
}

public class InstanceOfExecutor {

	public static void main(String[] args) {
	Rose r= new Rose();
	System.out.println(r instanceof Flower);

	}

}
