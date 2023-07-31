//To use for calling parameterized constructor in default constructor
package org.tnsif.thiskeyword;

public class ThisKeywordDemoThree {
	
	void print(ThisKeywordDemoThree t)
	{
		System.out.println("Hey There, I am waiting for you");
	}
	
	void display()
	{
		/*when you call any parameterized method inside non parameterized method then we get 
		 * an error to overcome that we have to use this keyword in argument in method call*/
		print(this);
	}

	public static void main(String[] args) {
		ThisKeywordDemoThree t = new ThisKeywordDemoThree();
		t.display();

	}

}
