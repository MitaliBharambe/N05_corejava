//program to demonstrate do while
package org.tsnif.looping;
import java.util.*;
public class DoWhileLoopExecution {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();
		do {
			System.out.println("Value of n is:"+n);
			n++;
		}while(n<14);
	}
}
