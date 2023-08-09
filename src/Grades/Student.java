package Grades;

import java.util.ArrayList;

public class Student {
//	 It should have private properties for the student's name, and grades. The grades property should be an ArrayList of integers. The student class should have a constructor that sets name property, and initializes the grades property as an empty ArrayList. The Student class should have the following methods:

	private String studentsName;
	ArrayList<Integer> grades = new ArrayList<>();

	public Student(String name, int grades) {
		this.studentsName = name;
		this.grades = grades;


	}

}
