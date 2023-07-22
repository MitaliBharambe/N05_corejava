//Program to demonstrate on user input
package org.tnsif.introduction;
import java.util.*;
public class UserInputDemo {
		public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value");
		int num=s.nextInt();
		System.out.println("The value of num is: "+num);
 
		System.out.println("Enter the value");
		float num1=s.nextFloat();
        System.out.println("The value of float num is: "+num1);
         
        System.out.println("The value of character  is: ");
        char c=s.next().charAt(0);
        System.out.println("Characteris: "+c);

        System.out.println("The value of string is: ");
        String str1=s.next();
        System.out.println("String is :"+str1);
        
        System.out.println("The value of string is: ");
        String str2=s.nextLine();
        s.next();
        System.out.println("String is :"+str2);
        s.close();
 
	}
}