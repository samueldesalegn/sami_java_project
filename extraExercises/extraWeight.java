package extraExercises;

import java.util.Scanner;

public class extraWeight {
	public static void main(String[] args) {
	
		double allowedWeight = 30, luggageWeight, feeFactor = 10, upperLimitWeight = 35;	

		try (Scanner keyBoard = new Scanner(System.in)) {
			System.out.println("\nEnter the weight of your luggage:");
			luggageWeight = keyBoard.nextDouble();
		}
		  
		double fee = 0;

		if(luggageWeight <= allowedWeight) {
			fee = 0;
		}else if(luggageWeight > allowedWeight && luggageWeight <= upperLimitWeight) {
			fee = 30;
		}else if(luggageWeight > upperLimitWeight) {
			fee = 30 + (luggageWeight-upperLimitWeight) * feeFactor;
		}
		System.out.println("your luggage fee is " + fee +"$" + ". Von Voyage!"); 
		
	}    
}
