package assignment67;

import java.util.Scanner;

public class yesOrNoResponse {  
	public static void main(String[] args) {
		String response;
		Boolean accept;

		try (Scanner keyBoard = new Scanner(System.in)) {
		  System.out.println("Enter  your response as \"yes/Yes\"" 
			+ "or \"y/Y\" or \"no\":");
	    response = keyBoard.nextLine();
			
		  if(response.equals("yes") || response.equals("y")) {
				accept = true;
				
				}else {accept = false; }
			// System.out.println("Accept is: " + accept);
			
			
			String result = response.substring(0, 1).toUpperCase()
			 + response.substring(1);

		  if(result.equals("Yes") || result.equals("Y") || 
			response.equals("yes") || response.equals("y")) {
				accept = true;

			} else { accept = false;}
			System.out.println("Accept is: " + accept);

	  }
  }    
}
