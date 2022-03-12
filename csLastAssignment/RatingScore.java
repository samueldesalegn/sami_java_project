// Question 2 of Assignment12 Solution

// a)
// public void inputRating()
// public int getMaxRating()
// public int getRating()
// public String getRatingString()

// b)
// public void inputRating()
// Precondition: maximum rating is positive.
// Postcondition: A value for the rating was obtained from the user.  The rating was greater than or equal to zero and less than or equal to the maximum possible rating.  The rating attribute was changed to the value obtained from the user.

// public int getMaxRating()
// Precondition: none.
// Postcondition: The maximum rating was returned.

// public int getRating()
// Precondition: none.
// Postcondition: The rating was returned.

// public String getRatingString()
// Precondition: none.
// Postcondition: The rating was returned in some nicely formatted string.



import java.util.Scanner;

public class RatingScore {

private int maxRating;

public static void main(String[] args){

try (Scanner keyScan = new Scanner(System.in)) {
	RatingScore rateMovie = new RatingScore();
	boolean redo = true;
	
	System.out.println("What is the movie name?");
	String movieName = keyScan.nextLine();
	rateMovie.setMovieName(movieName);
	
	System.out.println("Give a short description for the movie.");
	String movieDescription = keyScan.nextLine();
	rateMovie.MovieDescription(movieDescription);
	
	rateMovie.MaxRating();
	System.out.println("What max rate would you give the movie?");
	int rate = keyScan.nextInt();
	do{
	if(rate > rateMovie.maxRating){
	System.out.println("\nThe rating is higher than the max rating.");
	System.out.println("What would you rating will you give the movie?");
	rate = keyScan.nextInt();
	}else{
	rateMovie.setRating(rate);
	redo = false;
	}
	}while(redo);
	
	rateMovie.ReturnResult();
}
}

private void ReturnResult() {
}

private void setRating(int rate) {
}

private void MaxRating() {
}

private void MovieDescription(String md) {
}

private void setMovieName(String mn) {
}
}

