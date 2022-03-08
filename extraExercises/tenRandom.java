package extraExercises;

// import java.util.Scanner;

public class tenRandom {
	public static void main(String[] args) {



	// int random = (int)(Math.random()*100);
	for (int i = 1; i <= 10 ; i++){
	  int random = (int)(Math.random()*100);
		if(random % 2 == 0) {
			System.out.println(random + ", Even!");

		}else {System.out.println(random + ", Odd!");}
	  
	}	
	}  	
}
