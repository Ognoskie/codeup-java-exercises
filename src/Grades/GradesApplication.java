package Grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GradesApplication {
	final private static Input input = new Input();
	private static void execute() {
		HashMap<String, Student> students = populateStudents();
		System.out.println("Welcome!");

		do {
			printMenu(students);
			getInputFromUserAndDisplayResponse(students);
		} while(userWantsToContinue());

	}

	private static void getInputFromUserAndDisplayResponse(HashMap<String, Student> students) {
		String userInput;
		do{
			userInput = input.getString("Enter the username you want more info on:");
		} while(!students.containsKey(userInput));
		displayStudentInfo(students.get(userInput), userInput);
	}

	private static void displayStudentInfo(Student student, String username) {
		System.out.printf("Name - %s%n", student.getName());
		System.out.printf("Username - %s%n", username);
		System.out.printf("Grade Average - %.2f%n%n", student.getGradeAverage());
	}

	private static void printMenu(HashMap<String, Student> hashMap) {
		System.out.println("Students Usernames:\n");
		System.out.println(hashMap.keySet());
		System.out.println();
	}

	private static boolean userWantsToContinue() {
		return input.yesNo("Do you want to see another Student?");
	}

	private static HashMap<String, Student> populateStudents() {
		HashMap<String, Student> students = new HashMap<>();

		Student studentOne = new Student("Greg");
		studentOne.addGrade(67);
		studentOne.addGrade(58);
		studentOne.addGrade(2);
		students.put("Shroud", studentOne);

		Student studentTwo = new Student("Pam");
		studentTwo.setGrades(new ArrayList<>(List.of(5, 10, 15)));
		students.put("TheGregMeister", studentTwo);

		Student studentThree = new Student("OG Bobby Johnson");
		studentThree.setGrades(new ArrayList<>(List.of(100, 100, 95)));
		students.put("Big_Boofy", studentThree);

		Student studentFour = new Student("Alouicious");
		studentFour.setGrades(new ArrayList<>(List.of(100, 100, 95, 105)));
		students.put("Alouicious", studentFour);

		return students;
	}

	public static void main(String[] args) {
		execute();
	}
}

