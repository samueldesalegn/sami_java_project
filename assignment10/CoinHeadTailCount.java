// 1. Write a program that will compute statistics for eight coin tosses. The 
// user will enter either an h for heads or a t for tails for the eight tosses. The 
// program will then display the total number and percentages of heads and 
// tails. Use the increment operator to count each h and t that is entered. 
// For example, a possible sample dialogue between the program and the 
// user might be
// For each coin toss enter either h for heads or t for tails.
// First toss: h
// Second toss: t
// Third toss: t
// Fourth toss: h
// Fifth toss: t
// Sixth toss: h
// Seventh toss: t
// Eighth toss: t
// Number of heads: 3
// Number of tails: 5
// Percent heads: 37.5
// Percent tails: 62.5

// Solution/Code below:


package assignment10;
import java.util.Scanner;

public class CoinHeadTailCount {
  public static void main(String[] args) {
  String coinToss; 

     
  try (Scanner keyboard = new Scanner(System.in)) { 
    System.out.println("For each coin toss enter either 'h' for heads or 't' for tails.");

    int headCount =0;
    int tailCount = 0;
 
    for(int i = 0; i < 8; i++) {
      System.out.println("Enter the next toss"); //coin toss is either tail or head.
      coinToss = keyboard.nextLine();
  }
      if(coinToss.equalsIgnoreCase("h")) {
	headCount++;
      }else if(coinToss.equalsIgnoreCase("t")){
	tailCount++;
      }
    }
    System.out.println("The total head count: " + headCount);
    System.out.println("The total tail count: " + tailCount);
      
    double headPercent = (double)headCount* 100/8;
    double tailPercent = (double)tailCount * 100/8;
				
    System.out.println("Percent of heads: " + headPercent);  
    System.out.println("Percent of tails: "+ tailPercent); 
  }
}
	
