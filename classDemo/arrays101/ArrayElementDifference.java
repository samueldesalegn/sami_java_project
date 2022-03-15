package arrays101;
import java.util.Scanner;

public class ArrayElementDifference {  
	/*
  Write a complete Java program that reads 20 values of type double from the keyboard into an
  array. Display the last (20th) number read. Then display the numbers in the array and how
  much each number differs from the 20th number read. For example, if the last value typed by
  the user is 5.0, the difference between the array element 2.0 and 5.0 is −3.0. If an array element
  is 7.0, the difference is 2.0. Assume that the user enters 20 numbers, one per line, at the
  keyboard. You need not give elaborate instructions to the user.

  */

  public static void main(String[] args){

		try (Scanner keyboard = new Scanner(System.in)) { 
			System.out.println("How many size array do you want?"); 
	    int size = keyboard.nextInt( );
			double[] num = new double[size];
	    System.out.println("Enter n numbers:");
	    
	    for (int i = 0; i < num.length; i++) {
	      num[i] = keyboard.nextDouble();
	      
			  
	    }
	    System.out.println("The last element of the arry is: "+num[num.length -1]);

	  	for (double value : num) {
	      
	      System.out.println(value + " = element differs by " + (num[num.length-1]-value) );
			}
	    System.out.println("Have a nice week.");
		}
	}
}

