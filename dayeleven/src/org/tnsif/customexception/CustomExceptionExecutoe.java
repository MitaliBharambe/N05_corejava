package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionExecutoe {

	public static void main(String[] args) throws LoginCredentials {
		Scanner s= new Scanner(System.in);
		String email=s.nextLine();
		String password= s.nextLine();
		if(email.equals("mitali.gmail.com")&& password.equals("Pass@123") )
		{
			System.out.println("credential matched");
		}
		else
		{
			throw new LoginCredentials("credential matched");
		}
	}

}
