package assignment67;

import java.util.Scanner;

public class gradeWithSwitch {  
	public static void main(String[] args, Object Sysetm) {

		char letter = 0;
		double gradeValue;

		try (Scanner keyBoard = new Scanner(System.in)) {
		  System.out.println("Enter  your gradeValue: ");
	    letter = keyBoard.next().charAt(0);
		}  			
		switch (letter) {
			case 'A':
				gradeValue = 4.0;
				break;
			case 'B':
			gradeValue = 3.0;
				break;
			case 'C':
			gradeValue = 2.0;
				break;
			case 'D':
			gradeValue = 1.0;
				break;
			case 'F':
			gradeValue = 0.0;

			default:
			  gradeValue = 0.0;
				System.out.println("Try again letter");		
		
		}  
		System.out.println("The grade value is " + gradeValue); 
  }
}