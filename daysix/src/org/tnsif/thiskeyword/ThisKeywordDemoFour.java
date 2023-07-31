package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {

	  int x;
		ThisKeywordDemoFour()
			{
				this(34);
				System.out.println("Default constructor");
			}
			
		ThisKeywordDemoFour(int x)
			{
				this.x=x;
				System.out.println("Parameterized constructor:" +x);
			}

			public static void main(String[] args) {
				ThisKeywordDemoFour t = new ThisKeywordDemoFour();
			}

		}

