package org.tnsif.superkeyword;
class State{
	String stateName="Panjab";
}

class Capital extends State
{
	String stateName="Hariyana";
	String capital="Chandigarh";
	
	public void display() {
		System.out.println(super.stateName);
		System.out.println(stateName);
	}
}

public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Capital c =new Capital();
		System.out.println("The States of "+ c.capital+ " is:");
		c.display();

	}

}
