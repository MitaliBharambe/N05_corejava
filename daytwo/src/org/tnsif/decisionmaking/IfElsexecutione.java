package org.tnsif.decisionmaking;
import java.util.*;
public class IfElsexecutione {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int age= s.nextInt();
		int weight= s.nextInt();
		if(age>18 && weight>50)
		{
			System.out.println("Elligible for donate the blood");
		}
		else
		{
			System.out.println("Not Elligible for donate the blood");
		}
	}

}
