//child class
package org.tnsif.singleInheritance;

public class Student extends Citizen {
       private int rollno;
       private String collegeName;
	
       public Student() {
		super();
		System.out.println("Child class-Default constructor");
	}

	public Student(String city, int pinCode, long aadharNo, long contactNo, int rollno , String collegeName) {
		super(city, pinCode, aadharNo, contactNo);
		
		this.rollno=rollno;
		this.collegeName=collegeName;
		
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
       
       
       
       
       
}


