package arrays101;

import java.util.Scanner;

public class NumberAboveAverage {

	static Scanner sc = new Scanner(System.in);
	//input the size from the keyboard
	static int size = sc.nextInt();

  private static double[] temp = new double[size];
  private static double tempAverage;
  private static int days;

public static void main(String[] args){
System.out.println("This code will compute the average temperature and "
+ "\nthen count and display the number of days on which "
+ "\nthe temperature was above average.");
System.out.println();

setTemp();
getAverage();
System.out.println("The average is: " + tempAverage);
System.out.println();

isHigher();
}

/*
Precondition: method will ask user to supply the
temperature for each day up to 10 days.
Postcondition: all supplied temperatures will be
added to a array and can be used later on.
*/
private static void setTemp(){
for(int i = 0; i < temp.length; i++){
days = i + 1;
System.out.print("Enter the temperature for day " + days + ":");
double supplyTemp = sc.nextInt();
temp[i] = supplyTemp;
}
}

/*
Precondition: This method requires setTemp to collect
the array data first.
Postcondition: This method will count the array tempAverage and sum
them to get the average.
*/
private static double getAverage(){
double sum = 0;

for(int i = 0; i < temp.length; i++){
sum = sum + temp[i];
}

tempAverage = (double) (sum / temp.length);
return tempAverage;
}

/*
Precondition: THis method requires both setTemp and getAverage
to have been used first.
Postcondition: the method will display each day and specify
if on that day the temperature was either higher or lower than
the average temperature or if it was exactly the same.
*/

private static void isHigher(){
System.out.println("Now to see on what day the temperature was higher than the average");

for(int i = 0; i < temp.length; i++){
  days = i + 1;
  System.out.print("On day " + days + ": ");
  if(temp[i] > tempAverage){
    System.out.print("The temperature was higher than the average");
  }else if(temp[i] < tempAverage){
    System.out.print("The temperature was lower than the average");
  }else{
    System.out.print("The temperature was the average");
  }
  System.out.println();
}
}
}