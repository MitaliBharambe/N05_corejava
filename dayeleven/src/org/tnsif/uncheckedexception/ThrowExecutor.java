package org.tnsif.uncheckedexception;

import java.io.IOException;

//program to demonstrate on throw and throws keyword
public class ThrowExecutor {
	//throws is used to declare an exception
	static void isEligible(int age,int weight) throws IOException
	{
		if(age>18 && weight>50)
		{
			System.out.println();
		}
		else {
			//throw is used to throw an exception explicitly without using try catch finally block
			throw new IOException("age and weight criteria is not fulfilled");
		}
	}

	public static void main(String[] args) throws IOException{
		isEligible(12,54);
	}

}
