package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchCaseExecutor {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num= s.nextInt();
	
        switch(num){
        	case 1: if(num==1)
        	         {
        	           	System.out.println("Monday");
        	         }
        	         break;
        	case 2: if(num==2)
	                  {
	           	        System.out.println("Tuesday");
	                  }
	                 break;         
        	case 3: if(num==3)
                      {
     	                System.out.println("Wednesday");
                      }
        		     break; 
        	case 4: if(num==4)
        		 		{
     	        			System.out.println("Thursday");
        		 		}
        			break; 
        	case 5: if(num==5)
        			{
     	        		System.out.println("Friday");
        			}
        			break; 
        	case 6: if(num==6)
        			{
        				System.out.println("Saturday");
        			}
        			break; 
        	case 7: if(num==7)
        			{
        				System.out.println("Sunday");
        			}
        			break; 
           default :
        	   		System.out.println("Invalid input");
        	
        }
	}

}
