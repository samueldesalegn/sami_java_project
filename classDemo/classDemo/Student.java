package classDemo;

public class Student {

	String name;
	int Id;
	double gpa;


	public static boolean didPass(double score) {
		if(score >= 76) 
			return true;
		return false;
	}
}

