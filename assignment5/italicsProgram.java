package assignment5;

import java.util.Scanner;

public class italicsProgram {

	public static void main(String[] args) {
     
		String favoriteColor, favoriteFood, favoriteAnimal, friendFirstName;
		try (Scanner keyBoard = new Scanner(System.in)) {
			System.out.println("Enter your favorite color: ");
			favoriteColor = keyBoard.nextLine();

			System.out.println("Enter your favorite food: ");
			favoriteFood = keyBoard.nextLine();

			System.out.println("Enter your favorite animal: ");
			favoriteAnimal = keyBoard.nextLine();

			System.out.println("Enter your friend's first name: ");
			friendFirstName = keyBoard.nextLine();
		}
		
		System.out.println("I had a dream that " + friendFirstName + " ate a " 
		+ favoriteColor +	" " + favoriteAnimal + "\nand said it tasted like " 
		+ favoriteFood + "!");

	}

}