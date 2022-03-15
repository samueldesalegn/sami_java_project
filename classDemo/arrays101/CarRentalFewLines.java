package arrays101;
import java.util.Scanner;

public class CarRentalFewLines {

	static double getCosts( int daysRequested, double usedMiles, double carDailyPrice) {
		double expectedMiles = 150*daysRequested;
		double expectedCost = daysRequested *carDailyPrice;

		double milesCost = (usedMiles <= expectedMiles)? 0: (usedMiles - expectedMiles);
		double daysCost = (daysRequested < 5)? expectedCost: expectedCost * 0.8;
		double totalCost = milesCost + daysCost;
		
		return totalCost;
	}



	public static void main(String[] args){
	  double carDailyPrice;
	  int daysRequested;
	  double usedMiles;
	  double totalCost = 0;
	  try (Scanner keyboard = new Scanner(System.in)) {

	  	System.out.println("Enter the car daily price");
		  carDailyPrice = keyboard.nextDouble();

		  System.out.println("Enter the number of days car requested: ");
		  daysRequested = keyboard.nextInt();

		  System.out.println("Enter the total miles used");
		  usedMiles = keyboard.nextDouble();
		

    totalCost = getCosts(daysRequested, carDailyPrice, usedMiles) ;
	
	  System.out.println(totalCost);
  }

  }
	
}