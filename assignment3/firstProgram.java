package assignment3;

import java.util.Scanner;

public class firstProgram {
  public static void main(String[] args) {

    System.out.println("Hello out there.");
    System.out.println("I will add three numbers for you.");
    System.out.println("Enter three whole numbers on a line:");

    int n1, n2, n3;

    try (Scanner keyBoard = new Scanner(System.in)) {
      n1 = keyBoard.nextInt();
      n2 = keyBoard.nextInt();
      n3 = keyBoard.nextInt();
    } 
    System.out.println("The sum of those three numbers is" );
    System.out.println(n1 + n2 + n3);    
  }
}
