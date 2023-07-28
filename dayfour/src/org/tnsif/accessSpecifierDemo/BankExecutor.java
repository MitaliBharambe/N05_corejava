package org.tnsif.accessSpecifierDemo;

import org.tnsif.accessSpecifier.Bank;

public class BankExecutor {

	public static void main(String[] args) {
		Bank b=new Bank();
        b.bankName="SBI";
        b.displayPublic();
        /* pinNo and displayPrivate methods are private 
         * so we can't use it in another class and 
         * another package only we can access inside the same class*/
        //b.pinNo;
        //b.displayPrivate;
        /*AccountNo and displayDefault method are default thats why, 
         * we are not able to access into another package 
         * only we can access within the same package*/
        //b.accountNo;
        //b.displayDefault;
	}

}
