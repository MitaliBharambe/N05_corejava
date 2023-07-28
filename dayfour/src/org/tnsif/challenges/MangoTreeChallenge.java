/*Question :
 * pratik is so much interested in gardening and hence he plants more trees in his garden
 * he plants trees in a rectangular fashion with the order of rows and columns and numbers the trees in a row wise order.
 * he plants the mango tree only in the first row and last column  so ,
 * given the tree number and rows and column
 *  your task is to find out whether the tree is mango tree or not*/

//**************************************************************************************************************************
package org.tnsif.challenges;

import java.util.Scanner;

public class MangoTreeChallenge {

	static void isMangoTree(int n, int t) {
		if (t % n == 0 || t % n == 1 || t <= n) {
			System.out.println("mango tree");
		} else {
			System.out.println("not a mango tree");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();//no of rows and cols
		int t = scan.nextInt();//number of tree need to check
		isMangoTree(n, t);
	}

}