package loopAssignments;

import java.util.Scanner;

public class sumOddNumbers {  
  public static void main(String[] args) {
		
  int n;
  try (Scanner keyBoard = new Scanner(System.in)) {
    System.out.println("\nEnter a number ");
    n = keyBoard.nextInt();
  }		
  int i =0, sum =0;
  while(i < n) { 
    sum += (i*2+1);
    i++;
  }
  System.out.println(sum);
   
  }    
}
