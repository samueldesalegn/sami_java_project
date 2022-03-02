package assignment67;

import java.util.Scanner;

public class degreeDegrees {  
	public static void main(String[] args) {
		int temp = 0;
		String label = "";

		try (Scanner keyBoard = new Scanner(System.in)) {
		  System.out.println("Enter the current temperature:");
	    temp = keyBoard.nextInt();
			
		  if((temp == 0) || (temp > 1)) {label = "degrees";
				
			}else if (temp == 1) {label = "degree"; }
			System.out.println("The temperature is " + temp + " " + label +"!");
				
	  }
  }    
}
