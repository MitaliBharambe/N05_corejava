
// TODO Auto-generated method stub

//There are n people standing in a circle waiting to be executed .
//The counting out begins at some point in the circle and proceeds around the circle in a fixed direction.
//In each step a certain number of people are skipped.
//And the next person is executed.
//The elimination proceeds around the circle (which is becoming smaller and smaller as the executed people are removed), 
//until only the last person remains who is given freedom.
//Given the total no of person n and a number k which indicates that k - 1 person are skipped 
//and the k^th person is killed in a circle.
//The task is to choose the person in the initial circle that survives.

package org.tnsif.challenges;

public class CircleChallenge {
    public static int findSurvivor(int n, int k) {
        if (n == 1)
            return 0; // Only one person, so that person survives (index 0).
        else
            return (findSurvivor(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        int n = 5; // Total number of people in the circle
        int k = 2; // Skip k-1 persons and kill the k-th person

        int survivorIndex = findSurvivor(n, k);
        System.out.println("The person at position " + (survivorIndex + 1) + " survives.");
    }


}