package arrays101;
import java.util.Scanner;

public class CarRentalMethod {

	static double extraMilesCost( int daysRequested, double usedMiles) {
		double extraCost = (usedMiles <= 150*daysRequested)? 0: (usedMiles - 150*daysRequested);
		// if(usedMiles <= 150*daysRequested) {
		// 	extraCost = 0;
		// }else {
		// 	extraCost = usedMiles - 150*daysRequested;
		// }
		return extraCost;
	}

	static double daysCost(int daysRequested, double carDailyPrice) {
		double daysCost = (daysRequested < 5)? daysRequested *carDailyPrice:daysRequested *carDailyPrice *0.8;
		// if(daysRequested < 5) {
		// 	daysCost = daysRequested *carDailyPrice;
		// }else {
		// 	daysCost = daysRequested *carDailyPrice *0.8;
		// }
		return daysCost;
		
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
		

    totalCost = daysCost(daysRequested, carDailyPrice) + extraMilesCost(daysRequested, usedMiles);
	
	  System.out.println(totalCost);
  }

  }
	
}

