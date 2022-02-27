package assignment5;

import java.util.Scanner;

public class hateToLove {

	public static void main(String[] args) {
     //Method1 (word for word)
		// System.out.println("Enter a line of text.");
    // String text = "I hate you.";
		// System.out.println(text);

		// // int position = text.indexOf("hate");
		// text = text.replace("hate", "love");
		// System.out.println("I have rephrased that line to read:");
		// System.out.println(text);		

		//Method2 (a program)
		String text = "";
		try (Scanner keyBoard = new Scanner(System.in)) {
			System.out.println("Enter a line of text with occurrence(s)" + 
			" of the word \"hate\".");
			text = keyBoard.nextLine();
		}
		// System.out.println(text);
		System.out.println("I have rephrased that line to read:");	
		
		int position = text.indexOf("hate"); // Index of first occurrence of hate.

		String rephrased = text.substring(0, position) + "love" 
		+ text.substring((position + 4));

		System.out.println(rephrased);
		
	}

}

	
	
	

