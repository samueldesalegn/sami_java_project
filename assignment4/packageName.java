package assignment4;

import java.util.Scanner;

public class packageName {  
	public static void main(String[] args) {
	      
	double taxRate= 0.1; double grossSalary;

  try (Scanner keyBoard = new Scanner(System.in)) {
    System.out.println("Enter the gross Salary");
	  grossSalary = keyBoard.nextDouble();
	}
	double netSalary = ((1.0-taxRate) * grossSalary) ;
	System.out.println("The net Salary is $" + netSalary);
	}    
}
