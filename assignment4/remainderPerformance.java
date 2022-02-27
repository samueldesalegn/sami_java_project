package assignment4;

import java.util.Scanner;

public class remainderPerformance {
	public static void main(String[] args){
		try (Scanner keyBoard = new Scanner(System.in)) {
			System.out.println("The functions of the program:"
			+ "\nFirst - a floating/decimal number will be supplied/inputed,"
			+ "\nSecond - The remainder after dividing for two,"
			+ "\nThird - the decimal number will be type cast to an int,");

			System.out.println("\nLabeling: "
			+ "\nx - will be the input number"
			+ "\ny - will be (x % 2) = remainder"
			+ "\nz - will be x type cast to an integer (int) and it will be the remainder %2)");

			System.out.println("\nEnter a decimal number.");
			float x = keyBoard.nextFloat();

		
			float y = x%2;
			int z = (int) x;
			z = z % 2;

			System.out.println("\nx is " + x +
			"\ny is " + y +
			"\nz is " + z);

			}
  }
}
