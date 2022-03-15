package arrays101;

public class ConvertToArray {

	public static char[] convertStringToArray(String text) {
		
		// text = text;
  
		// Creating array of string length
		char[] ch = new char[text.length()];

		// Copy character by character into array
		for (int i = 0; i < text.length(); i++) {
				ch[i] =text.charAt(i);
		}
		return ch; 

		// // Printing content of array
		// for (char c : ch) {
		// 		System.out.println(c);
	
	
	}
  public static void main(String[] args) {

		System.out.println(convertStringToArray("anyone"));

	}

}
	

