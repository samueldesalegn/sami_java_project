package assignment3;

import java.util.Scanner;

public class semanticErrors {
  public static void main(String[] args) {

		System.out.println("Enter the height, width, and depth of");
		System.out.println("a box and I will compute the volume.");

		int height=0, width=0, depth=0;

		try (Scanner keyBoard = new Scanner(System.in)) {
			height = keyBoard.nextInt();
			width = keyBoard.nextInt();
			depth = keyBoard.nextInt();
		}
		
		int volume = height * width * depth;
		
		System.out.println("The product is " + volume);

	}
    
}

	
	
    

	

