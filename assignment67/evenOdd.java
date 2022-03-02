package assignment67;

import java.util.Scanner;

public class evenOdd {  
	public static void main(String[] args) {
		int number;
	
    try (Scanner keyBoard = new Scanner(System.in)) {
		  System.out.println("Enter a number");
	    number = keyBoard.nextInt();
			
		  if(number % 2 == 0) {
				int result = number/2;
		    System.out.println(result);

			}else {
				int result = (number * 3) - 1;
				System.out.println("The result is: " + result);
			}
	  }
  }    
}
