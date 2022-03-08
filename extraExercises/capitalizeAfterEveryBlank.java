package extraExercises;

import java.util.Scanner;

public class capitalizeAfterEveryBlank {
	public static void main(String[] args) {
	
		String phrase = "";	

		try (Scanner keyBoard = new Scanner(System.in)) {
			System.out.println("\nEnter a sentence.");
			phrase = keyBoard.nextLine();
		}
		  System.out.println(phrase.charAt(0));
		  // String count = "";
			for (int i= 0; i < phrase.length(); i++) { 
				String f = "";
			  if (phrase.charAt(i) == ' ') {
					f += phrase.charAt(i+1);
					f = f.toUpperCase();
				}
				System.out.print(f);
	
			}
			// System.out.println(ph);
		
	}    
}
