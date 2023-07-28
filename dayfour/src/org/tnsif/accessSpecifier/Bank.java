//program to 
package org.tnsif.accessSpecifier;

public class Bank {
	public String bankName;
	private int pinNo;
    long accountNo=326469870; 
    
    //public method
    public void displayPublic()
    {
    	System.out.println("Bank name is:"+ bankName);
    }
    
    //private method
    private void displayPrivate()
    {
    	System.out.println("Pin no is:"+ pinNo);
    }
    
    //default method
    void displayDefault()
    {
    	System.out.println("Account Number is:"+ accountNo);
    }
}
