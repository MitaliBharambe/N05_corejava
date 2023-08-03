package org.tnsif.polymorphism;

import java.util.Scanner;



class Laptop{
	 String generation1,generation2;
	 void specification(String generation1,String generation2)
	 {
		 System.out.println("Laptop "+generation1);
	 }
}

class HP extends Laptop{
	String generation2;
	 void specification(String generation1, String generation2)
	 {
		 super.specification(generation1,generation2);
		 System.out.println("Laptop "+generation2);
	 }
}
public class MethodOverridingExecutor {
	public static void main(String[] args) {
		HP m=new HP();
		Scanner s = new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		m.specification(str1,str2);

	}

}
