package assignment67;

import java.util.Scanner;

public class bmiIndex {  
	public static void main(String[] args) {
		double mass, heightFeet, heightInch, bmi, height;
	
    try (Scanner keyBoard = new Scanner(System.in)) {
		  System.out.println("Enter mass in pound: ");
	    mass = keyBoard.nextDouble();
			System.out.println("Enter feet part of height : ");
			heightFeet = keyBoard.nextDouble();
			System.out.println("Enter the inch part of the height: ");
			heightInch = keyBoard.nextDouble();

			mass = mass/2.2;

			height = (double) ((heightFeet * 12) + heightInch) * 0.0254;

			bmi = mass/(Math.pow(height, 2));


      if(bmi < 18.5) {
		    System.out.println("Underweight");

			} 
			else if (bmi >= 18.5 && bmi < 25) {
				System.out.println("Normal weight");
				
			}else if(bmi >= 25 && bmi < 30) {
				System.out.println("Over Weight");
		  }else if (bmi >= 30) {
				System.out.println("Obese");

			}else { System.out.println("Invalid input!");}
			  
			  
	  }
  }    
}
