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


	public static int addingNums(int integer1, int integer2) {
		return integer1 + integer2;
	}

	public static int subtractNums(int integer1, int integer2) {
		return integer1 - integer2;
	}

	public static int multiplyingNums(int integer1, int integer2) {
		return integer1 * integer2;
	}

	public static String divideNums(int integer1, int integer2) {
		if (integer2 == 0){
			return "Error: ";
		} else {
			int sum = integer1 / integer2;
			return String.valueOf(sum);
		}
	}

	public static void main(String[] args) {
		System.out.println(addingNums(10, 10));
		System.out.println(subtractNums(20, 30));
		System.out.println(multiplyingNums(10, 10));
		System.out.println(divideNums(10, 2));

	}





}
