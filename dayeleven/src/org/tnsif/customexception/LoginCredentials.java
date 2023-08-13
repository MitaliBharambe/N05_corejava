package org.tnsif.customexception;
//Program to demonstrate on user-defined exception
public class LoginCredentials extends Exception{
      private String str;

	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
      
      
}
