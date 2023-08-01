package org.tnsif.statickeyword;

public class StaticMethod {

	static int x=2;
	static String clgName="MET";
	/*if any method outside the main function and if you want to access that method inside main function
	 * we have to make that method as static*/
	public static void print() {
		System.out.println(clgName);
		//we can't use non static variable inside any static method
		System.out.println(x);
	}
	public static void main(String[] args) {
		print();

	}

}
