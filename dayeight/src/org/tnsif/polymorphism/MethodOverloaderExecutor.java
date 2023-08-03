//program to demonstrate on Compile time polymorphism
package org.tnsif.polymorphism;

import java.util.Scanner;

class Bollywood{
	String str1,str2,str3;
	static void display(String str1,String str2)
	{
		System.out.println(str1 +" Loves "+ str2);
	}
	
	static void display(String str1,String str2,String str3)
	{
		System.out.println(str1 +" Loves "+ str2 +" As well as "+ str3);
	}
}
public class MethodOverloaderExecutor {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		String str1=s.next();
		String str2=s.next();
		String str3=s.next();
		Bollywood.display(str1, str2);    
		Bollywood.display(str1, str2, str3);
	}

}
