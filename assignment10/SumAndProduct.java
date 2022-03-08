package assignment10;
import java.util.Scanner;

public class SumAndProduct {
	public static void main(String[] args) {
		int max = 20;
		int sum = 0;
		double product = 1;

     
		try (Scanner keyboard = new Scanner(System.in)) { 
			System.out.println("Enter a number \"max\" ");
			max = keyboard.nextInt();
		}
			for(int i = 1; i <= max; i++) {

				sum += i;
				product *= i;
			}		
			System.out.println("The sum is " + sum + " and the product is " + product);  
	}
}
