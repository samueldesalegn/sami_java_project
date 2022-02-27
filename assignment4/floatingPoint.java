package assignment4;

import java.util.Scanner;

public class floatingPoint {
	public static void main(String[] args) {
		System.out.println("Enter the value of x.");

		float x, y, z;

		try (Scanner keyBoard = new Scanner(System.in)) {
			x = keyBoard.nextFloat();
		}
		
		y = (float) (1.0 / x) ; // y is reciprocal of x
		
		System.out.println("The value of x: " + x);
		System.out.println("The value of y: " + y);
		System.out.println("The product of x and y: " + x * y);

	  z = x * y - 1; // subtract 1 from the product of x and y

		System.out.println("The value of x: " + z);

		System.out.println("The conclusion is y can only be any float number but x can be any float numbers but 0!");

	}
    
}
