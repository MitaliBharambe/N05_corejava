package org.tnsif.checkedexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			FileInputStream f= new FileInputStream("C:\\Users\\hp\\Desktop\\function.docx");
			System.out.println("File found");
		} catch (FileNotFoundException e) {
			System.out.println("File not found "+e);
		}
		
		/*public static void main(String[] args) throws FileNotFoundException {
		FileInputStream f= new FileInputStream("C:\\Users\\hp\\Desktop\\function.docx");
		}*/
	}

}
