

package assignment4;

import java.util.Scanner;

public class twoNames {  
	public static void main(String[] args) {
	      
	String name1, name2, twoNames = "";
	
  try (Scanner keyBoard = new Scanner(System.in)) {
		System.out.println("Enter two names");
	  name1 = keyBoard.nextLine();
    name2 = keyBoard.nextLine();
		
		twoNames = (String) (name1 + " & " + name2)  ;
		System.out.println(twoNames);
	}
	
}    
}
