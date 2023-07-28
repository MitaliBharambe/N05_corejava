//program to print right angle pattern using *
package org.tnsif.homework;
import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		int k=1;
		for(int i=1; i<=n;i++)
		{
			for(int j=1; j<=k;j++)
			{
				System.out.print("*");
			}
			k++;
			System.out.println();
		}

	}

}
