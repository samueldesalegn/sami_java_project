package assignment4;

import java.util.Scanner;

public class doubleValues {
	public static void main(String[] args){
		try (Scanner keyBoard = new Scanner(System.in)) {
			System.out.println("The functions of the program:"
			+ "\nFirst - a decimal number will be supplied/inputed,"
			+ "\nSecond - The decimal number will be type cast to an int,"
			+ "\nThird - the decimal number will be type cast to a byte.");
			System.out.println("\nLabeling: "
			+ "\nx - will be the input number"
			+ "\ny - will be x type cast to an integer (int)"
			+ "\nz - will be x type cast to a byte");
			System.out.println("\nEnter a decimal number.");
			float x = keyBoard.nextFloat();

			int y = (int) x;

			System.out.println("\nCasting " + x + " to an integer.");
			System.out.println("x is: " + x);
			System.out.println("y is: " + y);

			byte z = (byte) x;

			System.out.println("\nCasting " + x + " to a byte");
			System.out.println("x is: " + x);
			System.out.println("z is: " + z);
		
		}

  }
}