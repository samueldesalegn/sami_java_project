package classDemo;

import java.util.ArrayList;
import java.util.List;

public class MethodStudent {



	public static void main(String[] args) { 

	Student std1 = new Student();
	Student std2 = new Student();
	Student std3 = new Student();

  std1.name = "Desalegn";
	std1.Id = 101;
	std1.gpa = 4.0;



	std2.name = "Muluken";
	std2.Id = 102;
	std2.gpa = 3.6;

	std3.name = "Isabelle";
	std3.Id = 103;
	std3.gpa = 3.5;

	List<Student>studentList = new ArrayList<>();
	studentList.add(std1);
	studentList.add(std2);
	studentList.add(std3);

	// for (Student s : studentList) {
	// 	System.out.println(s.name + "-" + s.Id);
	// }

	// for (int i = 0; i < studentList.length; i++) {
	// 	double studentScore = (studentList[i].gpa/4 *100);
	// 	System.out.println(Student.didPass(studentScore));
	// }

	}
	
}
