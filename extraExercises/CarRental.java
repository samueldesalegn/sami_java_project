package extraExercises;
import java.util.Scanner;

public class CarRental {
	public static void main(String[] args) {

		double carDailyPrice = 30;
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
		}

		if(daysRequested < 5 && usedMiles <= 150*daysRequested) {
			totalCost = daysRequested *carDailyPrice;
		}else if((daysRequested >=5) && (usedMiles <= 150*daysRequested)) {
			totalCost = (daysRequested *carDailyPrice)*0.8;
		}else if((daysRequested >=5) && (usedMiles > 150*daysRequested)) {
			totalCost = (daysRequested *carDailyPrice)*0.8 + (usedMiles - 150*daysRequested)*1;

		}
		System.out.println("The total cost = " + totalCost);

	}
	
}
