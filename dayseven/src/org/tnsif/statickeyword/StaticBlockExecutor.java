package org.tnsif.statickeyword;

public class StaticBlockExecutor { 
   static float salary;
   String companyName;
  
   /*Static block is used to initialized the static variable
    * we can't assign a value for any non-static variable inside the static block*/
   static {
	   salary=563289.23f;
	   System.out.println(salary);
   }
   
   static void print()
   {
	   System.out.println("This is salary");
   }
	public static void main(String[] args) {
		print();
	}

}
