package arrays101;
// import java.util.Scanner;

public class ArrayBasics { 

	public static void main(String[] args){
		// double[] temp = new double[7];
	  // try (Scanner keyboard = new Scanner(System.in)) { 
    //   System.out.println("Enter 7 temperatures:");
    //   double sum = 0;
		// 	double avg = 0;
    //   for (int i = 0; i < 7; i++) {
    //     temp[i] = keyboard.nextDouble();
    //     sum += temp[i] ;
		// 		avg = sum/7;
    //   }
    //   System.out.println(sum / 7);

		// 	for (int i = 0; i < 7; i++) {
    //     if (temp[i] < avg)
    //       System.out.println(temp[i] + " = below average");
    //     else if (temp[i] > avg)
    //     System.out.println(temp[i] +" = above average");
    //     else //temperature[index] == average
    //   System.out.println(temp[i] + " = the average");
    //   }
    //   System.out.println("Have a nice week.");
		// int[] list = new int[6];
    // try (Scanner keyboard = new Scanner(System.in)) { 
    //   int number = keyboard.nextInt();
    //   int i = 0;
	  //   while ( (i <list.length) && (number >= 0) ) { 
    //     list[i] = number;
    //     i++;
    //     number = keyboard.nextInt();
    //   }
    //   if (number >= 0) {
    //     System.out.println("Could not read in all the numbers.");
    //     System.out.println("Only able to read" + list.length + " numbers.");
      // }
				
		// }
    int[] arr = new int[] {1, 2, 4, 5};

    for(int value : arr)
      System.out.println(value);
	}
}
