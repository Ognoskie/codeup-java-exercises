package Grades;

public class StudentTest{
	public static void main(String[] args) {
		Student student = new Student("Greg");
		student.addGrade(98);
		student.addGrade(89);
		student.addGrade(67);
		System.out.println(student.getName());
		System.out.println(student.getGradeAverage());

	}
}
