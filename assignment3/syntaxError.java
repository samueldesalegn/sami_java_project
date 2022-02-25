package assignment3;

import java.util.Scanner;

public class syntaxError {
	public static void main(String[] args) {
		System.out.println("Enter two numbers to multiply.");

		int n1, n2;

		try (Scanner keyBoard = new Scanner(System.in)) {
			n1 = keyBoard.nextInt();
			n2 = keyBoard.nextInt();
		}
		
		int product = n1 * n2;
		
		System.out.println("The product is " + product);

	}
    
}
