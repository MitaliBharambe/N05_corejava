package org.tnsif.singledimentionalarray;
//driver class
//program to demonstrate on array of object
public class ArraysOfObjectDemo {

	public static void main(String[] args) {
	 Employee arr[]=new Employee[2];
	 arr[0]=new Employee(101,"Mitali",90000.0);
	 arr[1]=new Employee(102,"Mitali2",90000.0);
	 
	 for(int i=0;i<arr.length;i++)
	 {
		 System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
	 }
	}

}
