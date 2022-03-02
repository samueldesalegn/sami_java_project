package assignment67;

import java.util.Scanner;

public class stringNote {  
	public static void main(String[] args) {
		int x, y, z;
	
    try (Scanner keyBoard = new Scanner(System.in)) {
		  System.out.println("Enter x");
	    x = keyBoard.nextInt();
			System.out.println("Enter y");
	    y = keyBoard.nextInt();
			System.out.println("Enter z");
	    z = keyBoard.nextInt();
		}
		  if(x < y && y < z) {
		    System.out.println("The order is: " + x + "," + y +","+ z);
			}else if(x < z && z < y) {
				System.out.println("The order is: " + x + "," + z +","+ y);

			} else if(y < x && x < z) {
		    System.out.println("The order is: " + y + "," + x +","+ z);
				
			}else if(z<x && x<y) { 
		    System.out.println("The order is: " + z + "," + x +","+ y);
			}else if(z<y && y<x) { 
		    System.out.println("The order is: " + z + "," + y +","+ x);
			} else if(y < z && z < x) {
		    System.out.println("The order is: " + y + "," + z +","+ x);
			}
  }    
}