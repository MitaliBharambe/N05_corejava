//program to demonstrate on runtime array to find out the largest element in an array
package org.tnsif.singledimentionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {

	public static void main(String[] args) {
		int i;
		Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of element in an array:");
        int n=s.nextInt();
        int arr[] = new int[n];
        for(i=0;i<n;i++)
        {
        	arr[i]= s.nextInt();      
        	
        }
        int max= arr[0];        
        for(i=0;i<n;i++)
        {
        	if(arr[i]>max)
        	{
        		max=arr[i];
        	}
        	
        }
        
       System.out.println("The maximum number in array is: "+max); 
       
       Arrays.sort(arr);
       for(i=0;i<n;i++)
       {
       System.out.print(arr[i]+" ");  
       	
       }
	}

}
