package loopAssignments;

import java.util.Scanner;

public class powerOfNumbers {  
	public static void main(String[] args) {
		
		int n;
		try (Scanner keyBoard = new Scanner(System.in)) {

			System.out.println("\nEnter a number.");
	    n = keyBoard.nextInt();
		}	
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				sum += Math.pow(i, 2);
			}
		  System.out.println(sum);
		
  }    
}
