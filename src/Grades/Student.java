package Grades;

import java.util.ArrayList;

public class Student{

	// returns the student's name
	public String getName(){
		return this.studentsName;
	}
	// adds the given grade to the grades property
	public void addGrade(int grade) {
		grades.add(grade);
	}

	// returns the average of the students grades
	public double getGradeAverage() {
		double sum = 0;
		for (int grade : grades){
			sum += grade;
		}
			return sum / grades.size();
	}

	public void setGrades(ArrayList<Integer> grades){
		this.grades = grades;
	}

	private String studentsName;
	private ArrayList<Integer> grades;

	public Student(String name) {
		this.studentsName = name;
		this.grades = new ArrayList<>();


	}
	public String toString() {
		return this.studentsName;
	}
}
