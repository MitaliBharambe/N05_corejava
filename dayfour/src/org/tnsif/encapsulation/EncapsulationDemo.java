//program to demonstrate on encapsulation
/*encapsulation achieves the data hiding using private access specifier*/
//driver class- means which contains main function
package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.setAccountNo(235896314);
		h.setAccountType("Current Account");
        h.setCvvtNo(223);
        h.setPinNo(123);
        System.out.println(h.getAccountNo());
        System.out.println(h.getAccountType());
        System.out.println(h.getCvvtNo());
        System.out.println(h.getPinNo());
        //we can print data using both ways
        System.out.println(h);
	}

}
