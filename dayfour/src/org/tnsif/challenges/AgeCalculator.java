/*ask a user what their birth year encoded as two digit(like "62")
 * and for the current year , also encoded as two digit(like "99")
 * write a program to find the user current age in years*/

package org.tnsif.challenges;
import java.util.Scanner;

public class AgeCalculator {
static void agecalculator(int birth, int current) {
	if (current>birth) {
		System.out.println(current-birth);
	}
	else {
		System.out.println((100-birth)+current);
	}
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter birth year");
		int birth = scan.nextInt();
		System.out.println("Enter current year");
		int current = scan.nextInt();
		agecalculator(birth, current);	
	}	
}