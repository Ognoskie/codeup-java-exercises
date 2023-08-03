import java.util.Scanner;
public class MethodsExercises {


	//	Basic Arithmetic
//
//	Create four separate methods. Each will perform an arithmetic operation:
//
	//	Addition
	//	Subtraction
	//	Multiplication
	//	Division
//
//	Each function needs to take two parameters/arguments so that the operation can be performed.
//
//	Test your methods and verify the output.
//
//	Add a modulus method that finds the modulus of two numbers.


	public static double addingNums(double integer1, double integer2) {
		return integer1 + integer2;
	}

	public static double subtractNums(double integer1, double integer2) {
		return integer1 - integer2;
	}

	public static double multiplyingNums(double integer1, double integer2) {
		return integer1 * integer2;
	}

	public static String divideNums(double integer1, double integer2) {
		if (integer2 == 0){
			throw new IllegalArgumentException("Cannot pass 0");
		} else {
			double sum = integer1 / integer2;
			return String.valueOf(sum);
		}
	}

//	Create a method that validates that user input is in a certain range and returns that input as an integer if it is within the given range. If not, prompt the user to input their number again until the input is within range.
//
//	The method signature should look like this:
//
//
//	public static int getInteger(int min, int max);
//	and is used like this:
//
//
//			System.out.print("Enter a number between 1 and 10: ");
//	int userInput = getInteger(1, 10);
//	If the input is invalid, prompt the user again.




//	public static int minMax(int min, int max) {
//		System.out.println("Enter a number between 1 to 20");
//		int userInput = minMax(1, 10);
//	}





	public static void main(String[] args) {
		System.out.println(addingNums(10, 10));
		System.out.println(subtractNums(20, 30));
		System.out.println(multiplyingNums(10, 10));
		System.out.println(divideNums(10, 0));

	}





}
