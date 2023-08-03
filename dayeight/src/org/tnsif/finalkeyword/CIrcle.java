package org.tnsif.finalkeyword;

public class CIrcle extends Shape{
	 final float AREA =34.6f;
	 /*we can not override the final method
	  void printShapeType()
	   {
		   System.out.println(area+"sq.cm");
	   }*/
	 
	 //we can overload the method
	 void printShapeType(float AREA)
	 {
		 System.out.println(AREA+"sq.cm");
	 }
}
