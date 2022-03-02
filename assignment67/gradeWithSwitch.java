package assignment67;

import java.util.Scanner;

public class gradeWithSwitch {  
	public static void main(String[] args) {

		char grade = 'B';
		

		// try (Scanner keyBoard = new Scanner(System.in)) {
		//   System.out.println("Enter  your grade: ");
	  //   grade = keyBoard.next();
			
		switch (grade) {
			case 'A':
				System.out.println("Your grade value is 4.0" );
				break;
			case 'B':
				System.out.println("Your grade value is 3.0");
				break;
			case 'C':
				System.out.println("Your grade value is 2.0");
				break;
			case 'D':
				System.out.println("Your grade value is 1.0");
				break;
			case 'F':
				System.out.println("Your grade value is 0.0");

			default:
				System.out.println("Try Again with another input");		
			
    }    
  }
}