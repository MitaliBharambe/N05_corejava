package org.tnsif.customexception;

import java.util.Scanner;

public class CustomExceptionTryCatch {
	public static void main(String[] args){
		Scanner s= new Scanner(System.in);
		String email=s.nextLine();
		String password= s.nextLine();
		try {
		if(email.equals("mitali.gmail.com")&& password.equals("Pass@123") )
		{
			System.out.println("credential matched");
		}
		else
		{
			throw new LoginCredentials("credential matched");
		}
		}
		catch(LoginCredentials e)
		{
			System.out.println("credential not matched "+e);
		}	
	}

}




	
