package org.tnsif.decisionmaking;
import java.util.*;
public class NestedIfElseExecutor {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int age= s.nextInt();
		int weight= s.nextInt();
		
		if(age>=12)
		{
			if(weight>=40)
			{
				System.out.println("Eligible for bungi jumping");
				if(weight>110)
				{
					System.out.println("Extra ropes needed");
				}
			}
			else
			{
				System.out.println("Not Eligible for bungi jumping");
			}
		}
		else
		{
			System.out.println("Not Eligible for bungi jumping");
		}
		s.close();

	}

}
