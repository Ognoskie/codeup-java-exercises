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












		public static int getInteger(int min, int max) {
			Scanner scanner = new Scanner(System.in);
			int userInput;

			while (true) {
				try {
					userInput = Integer.parseInt(scanner.nextLine());
					if (userInput >= min && userInput <= max) {
						break;
					} else {
						System.out.print("Invalid input. Please enter a number between " + min + " and " + max + ": ");
					}
				} catch (NumberFormatException e) {
					System.out.print("Invalid input. Please enter a valid number between " + min + " and " + max + ": ");
				}
			}

			return userInput;
		}



//	Calculate the factorial of a number.
//
//	Prompt the user to enter an integer from 1 to 10.
//	Display the factorial of the number entered by the user.
//	Ask if the user wants to continue.
//	Use a for loop to calculate the factorial.
//	Assume that the user will enter an integer, but verify it’s between 1 and 10.
//	Use the long type to store the factorial.
//	Continue only if the user agrees to.
//	A factorial is a number multiplied by each of the numbers before it.
//	Factorials are denoted by the exclamation point (n!). Ex:
//
//
//			1! = 1               = 1
//			2! = 1 x 2           = 2
//			3! = 1 x 2 x 3       = 6
//			4! = 1 x 2 x 3 x 4   = 24



	public static int factorial (){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("The factorial of " + n + " is " + fact);
		return n;
	}






	public static void main(String[] args) {
//		System.out.println(addingNums(10, 10));
//		System.out.println(subtractNums(20, 30));
//		System.out.println(multiplyingNums(10, 10));
//		System.out.println(divideNums(10, 0));

//		System.out.print("Enter a number between 1 and 10: ");
//		int userInput = getInteger(1, 10);
//		System.out.println("You entered: " + userInput);
//
		System.out.print("Enter a number between 1 and 10: ");
		int userInput = getInteger(1, 10);
		System.out.println("You entered: " + userInput);

		System.out.println(factorial());


	}





}
