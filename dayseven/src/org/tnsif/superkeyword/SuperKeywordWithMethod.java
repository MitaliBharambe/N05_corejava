//super keyword can be used to invoke the parent method if method name is same in both parent and child class
package org.tnsif.superkeyword;
class Sports{
	String sportName;
	void display(String sportName)
	{
		System.out.println("Sports name is:" + sportName);
	}
	
}

class Cricket extends Sports{
	int noOfPlayers=11;
	void display()
	{
		super.display("Cricket");
		System.out.println("No of players:" + noOfPlayers);
	}
}

public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		Cricket c = new Cricket();
		c.display();

	}

}
