package assignment67;

import java.util.Scanner;

public class numberFactor {  
	public static void main(String[] args) {
		int number, factor;
	
    try (Scanner keyBoard = new Scanner(System.in)) {
		  System.out.println("Enter a number");
	    number = keyBoard.nextInt();
			System.out.println("Enter a factor number");
	    factor = keyBoard.nextInt();
		

		  if(number % factor == 0) {
		    System.out.println(number +" is divisible by " + factor +"!");

			} else {
				System.out.println(number +" is not divisible by " + factor +"!");
		  }
		}	
  }    
}