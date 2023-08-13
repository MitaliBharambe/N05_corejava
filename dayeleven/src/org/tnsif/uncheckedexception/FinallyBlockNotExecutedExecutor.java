package org.tnsif.uncheckedexception;

import java.util.Scanner;
//commented portion is reason for finallyblock not execution
public class FinallyBlockNotExecutedExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x= s.nextInt();
		int y= s.nextInt();
        /*try block contains exceptional code */
		try {
			System.out.println(x/y);
			/*When we use system.exit(0) then finally block does not executed*/
			//System.exit(0);
		}
	    //catch block is used to handle that exception		
		catch(Exception e)
		{
			System.out.println("Exception handled"+e);
			/*When we use system.exit(0) then finally block does not executed*/
			//System.exit(0);
		}
		finally{
			//when finally block contains an exception then finally block does not executed
			//System.out.println(4/0);
			System.out.println("Finally block is always executed");
		}

	}

}
