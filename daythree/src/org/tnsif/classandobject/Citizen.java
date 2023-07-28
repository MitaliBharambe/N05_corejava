//Program to demonstrate on default and parameterized constructor
package org.tnsif.classandobject;

public class Citizen {
    //data members
	String citizenType;
	long aadharno;
	String gender;
	String city;
	public Citizen() {
		System.out.println("Demonstration on default constructor");
	}
	
	//parameterized constructor
	public Citizen(String citizenType, long aadharno, String gender, String city) {
		super();
		this.citizenType = citizenType;
		this.aadharno = aadharno;
		this.gender = gender;
		this.city = city;
		
	}

	@Override
	public String toString() {
		return "Citizen [citizenType=" + citizenType + ", aadharno=" + aadharno + ", gender=" + gender + ", city="
				+ city + "]";
	}
	
	
	
}