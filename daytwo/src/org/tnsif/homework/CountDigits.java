//program to find number of digits in given number
package org.tnsif.homework;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String a= s.nextLine();
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			count++;
		}
		System.out.print("Digits in given num:"+count);
	}

}
