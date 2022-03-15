package arrays101;

import java.util.Scanner;
public class ArrayOfTemp {
 public static void main(String[] args) {

    try (Scanner keyboard = new Scanner(System.in)) {
	    System.out.println("How many temperatures do you have?"); 
	    int size = keyboard.nextInt( );
	    double[] temperature = new double[size];
	    // Read temperatures and compute their average:
	    System.out.println("Enter " + temperature.length + " temperatures:");
	    double sum = 0;
	    for (int index = 0; index < temperature.length; index++) {
	      temperature[index] = keyboard.nextDouble();
	      sum = sum + temperature[index];
	    }
	    double average = sum / temperature.length;
	    System.out.println("The average temperature is " +average); 
	    // Display each temperature and its relation to the average:
	    System.out.println("The temperatures are");
	    // for (int index = 0; index < temperature.length; index++) {
	    //   if (temperature[index] < average)
	    //    System.out.println(temperature[index] +" below average");
	    //   else if (temperature[index] > average)
	    //     System.out.println(temperature[index] + " above average");
	    //   else //temperature[index] == average
      //   	System.out.println(temperature[index] + " the average");
	    // }
			for (double value : temperature){
        if (value < average)
          System.out.println(value + " below average.");
        else if (value > average)
          System.out.println(value + " above average.");
        else //value == average
          System.out.println(value + " the average.");
      }
    }
    System.out.println("Have a nice week.");
  }
}