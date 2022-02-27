package assignment5;

import java.util.Scanner;

public class delimiterExercise {

	public static void main(String[] args) {
     
		String text = "";
		try (Scanner keyBoard = new Scanner(System.in)) {
			System.out.println("Enter a line of text. No punctuation please.");
			text = keyBoard.nextLine();
		}
		
		System.out.println("I have rephrased that line to read:");	
		
		int position = text.indexOf(" "); // Index of first whitespace.

		String rephrased = text.substring(position + 1) + " " 
		+ text.substring(0, position);

		//make the first letter capital
		String firstCapital = rephrased.substring(0, 1).toUpperCase() 
		+ rephrased.substring(1);

		System.out.println(firstCapital);

	}

}