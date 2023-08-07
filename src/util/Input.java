package util;

//Create a package inside of src named util. Inside of util, create a class named Input that has a private field named scanner. When an instance of this object is created, the scanner field should be set to a new instance of the Scanner class. The class should have the following methods, all of which return command line input from the user:
//
//		String getString()
//		boolean yesNo()
//		int getInt(int min, int max)
//		int getInt()
//		double getDouble(double min, double max)
//		double getDouble()
//		The yesNo method should return true if the user enters y, yes, or variants thereof, and false otherwise.
//
//		The getInt(int min, int max) method should keep prompting the user for input until they give an integer within the min and max. The getDouble method should do the same thing, but with decimal numbers.
//
//		Create another class named InputTest that has a static main method that uses all the methods from the Input class.


import java.util.Scanner;

public class Input {
	// Instance Field/Property/Variable
	private Scanner scanner;

	// Constructors
	public Input() {
		this.scanner = new Scanner(System.in);
	}

	// Instance Methods
	public String getString() {
		return this.scanner.nextLine();
	}
	public String getString(String prompt) {
		System.out.println(prompt);
		return this.getString();
	}

	// return true if user enters "yes", "y", "Y", "yassss"
	// return false if user enters something that isn't interpreted as "yes"
	public boolean yesNo() {
		return this.getString().trim().toLowerCase().startsWith("y");
	}
	public boolean yesNo(String prompt) {
		System.out.println(prompt);
		return this.yesNo();
	}

	public int getInt() {
		try {
			return Integer.parseInt(this.getString());
		} catch (NumberFormatException e) {
			System.out.println("You must enter a whole number");
			return this.getInt();
		}
	}
	public int getInt(String prompt) {
		System.out.println(prompt);
		return this.getInt();
	}
	public int getInt(int min, int max) {
		int userInt = this.getInt();
		if(userInt >= min && userInt <= max) {
			return userInt;
		} else {
			System.out.printf("The number must be between %d and %d. Please try again.%n", min, max);
			return getInt(min, max);
		}
	}
	public int getInt(String prompt, int min, int max) {
		System.out.println(prompt);
		return this.getInt(min, max);
	}

	public double getDouble() {
		try {
			return Double.parseDouble(this.getString());
		} catch (NumberFormatException e) {
			System.out.println("You must enter a number");
			return this.getDouble();
		}
	}
	public double getDouble(String prompt) {
		System.out.println(prompt);
		return this.getDouble();
	}
	public double getDouble(double min, double max) {
		double userDouble = this.getDouble();
		if(userDouble >= min && userDouble <= max) {
			return userDouble;
		} else {
			System.out.printf("The number must be between %f and %f. Please try again.%n", min, max);
			return getDouble(min, max);
		}
	}
	public double getDouble(String prompt, double min, double max) {
		System.out.println(prompt);
		return this.getDouble(min, max);
	}


}
