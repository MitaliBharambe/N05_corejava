package org.tnsif.interfacedemo;
//An interface which contains an exactly one abstract method then that interface is known as functional interface 
// below annotation ensures that we have to use exactly one abstract method inside an interface
@FunctionalInterface
public interface Popcorn {
   void displayReceipe();
}
