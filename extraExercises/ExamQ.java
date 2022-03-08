package extraExercises;
import java.util.Scanner;

public class ExamQ {
	public static void main(String[] args) {

		double carDailyPrice = 50.99;
		int daysRequested, daysRented;
		double totalCost = 0;

		try (Scanner keyboard = new Scanner(System.in)) {

		  System.out.println("Enter the number of days car requested");
		  daysRequested = keyboard.nextInt();

		  System.out.println("Enter the number of days car rented: ");
		  daysRented = keyboard.nextInt();
		}
		if(daysRented <= daysRequested) {
			totalCost = daysRented *carDailyPrice;
		}else if(daysRented > daysRequested) {
			totalCost = (daysRequested *carDailyPrice) + ((daysRented-daysRequested)*2*carDailyPrice);
		}
		System.out.println("The total cost = " + totalCost);

	}
	
}
