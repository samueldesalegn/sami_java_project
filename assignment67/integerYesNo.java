package assignment67;

import java.util.Scanner;

public class integerYesNo {  
	public static void main(String[] args) {
		int number = 0;
		String label = "";

		try (Scanner keyBoard = new Scanner(System.in)) {
		  System.out.println("Enter the current temperature:");
	    number = keyBoard.nextInt();
			
		  if((number > 100) || (number >=50 && number <= 75)) {label = "YES";
				
			}else {label = "NO"; }
			System.out.println( label +"!");
				
	  }
  }    
}
