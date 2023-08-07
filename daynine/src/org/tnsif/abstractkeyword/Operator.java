package org.tnsif.abstractkeyword;

public abstract class Operator {
   abstract void operation();
   abstract void multiplication();
   void print(int a, int b) {
	   System.out.println(a+b);
   }
}
