//we can't override static method 
package org.tnsif.polymorphism;

class Animal{
	void eat() {
		System.out.println("eating animal");
	}
	static void run() {
		System.out.println("running animal");
	}
}

class Tiger extends Animal{
	void eat() {
		super.eat();
		System.out.println("eating tiger");
	}
	static void run() {
		System.out.println("running tiger");
	}
}

public class CheckStsticOverriding {

	public static void main(String[] args) {
		Tiger t= new Tiger();
		t.eat();
		t.run();
		Animal.run();

	}

}
