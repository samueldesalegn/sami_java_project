package loopAssignments;

import java.util.Scanner;

public class reverseString {  
  public static void main(String[] args) {
		
  String phrase = "";
  try (Scanner keyBoard = new Scanner(System.in)) {
    System.out.println("\nEnter a phrase.");
    phrase = keyBoard.nextLine();
  }	
  String reversePhrase = "";
  for (int i = phrase.length()-1; i >= 0; i--) {
    reversePhrase += phrase.charAt(i);
  }
  System.out.println(reversePhrase);
		
  }    
}
