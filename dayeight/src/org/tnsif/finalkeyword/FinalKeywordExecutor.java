package org.tnsif.finalkeyword;

public class FinalKeywordExecutor {

	public static void main(String[] args) {
		FinalVariable f= new FinalVariable();
		CIrcle c= new CIrcle();
		//we can't change the value of final variable
		//SALARY= 896600.f;
		f.print();
		c.printShapeType();
		c.printShapeType(c.AREA);
	}

}
