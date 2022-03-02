package assignment67;

import java.util.Scanner;

public class validTestScore {  
	public static void main(String[] args) {
		int score;
	
    try (Scanner keyBoard = new Scanner(System.in)) {
		  System.out.println("Enter a number");
	    score = keyBoard.nextInt();

		  if(score >= 0 && score <= 100) {
		    System.out.println("Valid Test Score!");

			} else {
				System.out.println("Invalid Test Score!");
				
			}
	  }
  }    
}