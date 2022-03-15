package arrays101;

public class SearchChars {

	static boolean search(String s, char ch) {
     boolean hasa = false;
		if (s.length() == 0) {
			hasa = false;
		}else {
			for(int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == 'e') {
					hasa = true;
				} else { 
					hasa = false;}
			}
		}
		return hasa;

	}
	public static void main(String[] args) { 
		System.out.println(search("Abebe", 'e'));

}
	
}
