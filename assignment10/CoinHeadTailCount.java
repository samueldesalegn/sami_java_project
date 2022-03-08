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
}
