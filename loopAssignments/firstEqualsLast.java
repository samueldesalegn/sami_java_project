package loopAssignments;

import java.util.Scanner;

public class firstEqualsLast {
  public static void main(String[] args) {
		
  try (Scanner keyBoard = new Scanner(System.in)) {
    String word = "";

    while(!word.equals("done")) { 
      System.out.println("\nEnter  words.");
      word = keyBoard.next();

      if(word.equals("done")) {
	break;
      }

      if(word.charAt(0) == word.charAt(word.length()-1)) {
	System.out.println("The first letter of the word is equal to the last words.");
      } else {System.out.println("The first letter of the word is not equal to the last words.");}

      }

    }
  }    
}

