// 3. (Optional) For all of the following words, if you move the first letter to the 
// end of the word, and then spell the result backwards, you will get the 
// original word:
// banana dresser grammar potato revive uneven assess
// Write a program that reads a word and determines whether it has this 
// property. Continue reading and testing words until you encounter the word 
// quit. Treat uppercase letters as lowercase letters.


package assignment10;

import java.util.Scanner;

public class FirstLetterAtEnd {  
  public static void main(String[] args) {
		
  try (Scanner keyBoard = new Scanner(System.in)) {
    String word = "";

    while(!word.equals("quit")) { 
      System.out.println("\nEnter  words.");
      word = keyBoard.next();
      word = word.toLowerCase();
      String modifiedword = word.substring(1) + word.substring(0,1);

      String text = "";
      for (int i = modifiedword.length()-1; i >= 0; i--) {
	text += modifiedword.charAt(i);
			
      }
      // System.out.println(text);
			
			
      if(word.equals("quit")) {
        break;
      }
        
      if(word.equals(text)) {
	System.out.println("Same spelling with reading backwards after moving the first to the end!");
      }else {System.out.println("Backward spelling property is not satified!");}

     }

  }
  }    
}
