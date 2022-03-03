package loopAssignments;

import java.util.Scanner;

public class countWhiteSpace {
  public static void main(String[] args) {
	
  String phrase = "";	
  try (Scanner keyBoard = new Scanner(System.in)) {
    System.out.println("\nEnter a sentence.");
    phrase = keyBoard.nextLine();
  }
  System.out.println(phrase.charAt(0));
	  
  int count = 0;
  for (int i= 0; i < phrase.length(); i++) { 
    if (phrase.charAt(i) == ' ') {count++;}
	
  }
  System.out.println(count);
		
  }    
}
