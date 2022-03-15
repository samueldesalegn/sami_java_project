package arrays101;

// import java.util.Scanner;

public class ArrayExamp {

	public static void main(String[] args) {

		// double tide[] = {12.2, -7.3, 14.2, 11.3};
    // System.out.println("Tide 1 is " + tide[1]);
    // System.out.println("Tide 2 is " + tide[2]);

		int[] b = new int[10];
    for (int i = 0; i < b.length; i++)
      b[i] = 5 * i;
		for (int value : b)
		   System.out.print(value +" ");



		// char[] vowel = {'a', 'e', 'i', 'o', 'u'};
    // for (int index = 0; index <vowel.length; index++)
    //   System.out.println(vowel[index]);

		// int[] anArray = new int[10];
    // for (int i = 0; i <anArray.length; i++)
    //   anArray[i] = 2 * i;
    // for (int element : anArray)
    //   System.out.print(element + " ");
    // System.out.println();


	  // try (Scanner kbd = new Scanner(System.in)) { 
    //   int[] count = new int[4];
    //   count[0] = 0;
    //   count[1] = 0;
    //   count[2] = 0;
    //   count[3] = 0;
    //   System.out.println("Enter ten numbers between 0 and 3.");
    //   for (int i = 0; i < 10; i++) {
    //     int num = kbd.nextInt();
    //     count[num]++;
    //   }
    //   for (int i = 0; i < count.length; i++)
    //     System.out.println("You entered " + count[i] + " " + i + "'s");
	  // }	
  }
}
