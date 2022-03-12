// 2. What does the following fragment of code display? What do you think the 
// programmer intended the code to do, and how would you fix it
//   int max = 20;
//   int sum = 0;
//   intproduct = 1;
  
//    for(int i = 1; i <= max; i++) 

//     sum += i;
//     product *= i;
  
//   System.out.println("The sum is " + sum + " and the product is " + product);  

// Solution:

//The programmer looks to seek to solve the product and sum of iterations with max and min values. 
// For example, taking the maximum number 20:
// sum = 0 + 1 + 2 + 3 + 4 + 5 + ...... + 20;
// product = 1*2*3*4*5*6......*20;

// However, he/she missed forming proper blocks (curly braces for the loop) and product range is beyond integer.

//My Solution:


package assignment10;
import java.util.Scanner;

public class SumAndProduct {
  public static void main(String[] args) {
  int max = 20;
  int sum = 0;
  double product = 1;

     
  try (Scanner keyboard = new Scanner(System.in)) { 
    System.out.println("Enter a number \"max\" ");
    max = keyboard.nextInt();
  }
  for(int i = 1; i <= max; i++) {

    sum += i;
    product *= i;
  }		
  System.out.println("The sum is " + sum + " and the product is " + product);  
  }
}
