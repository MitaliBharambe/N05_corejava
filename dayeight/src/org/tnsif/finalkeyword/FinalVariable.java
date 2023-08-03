// program to demonstrate on final keyword with variable

package org.tnsif.finalkeyword;
public class FinalVariable {

	//the blank final field NUM may not have been initialized
	// final int NUM;
	
	final float SALARY=78900.f;
	
	public void print()
	{
		//we can't change the value of final variable
		//SALARY= 896600.f;
		System.out.println("Salary is:"+SALARY);
	}
}
