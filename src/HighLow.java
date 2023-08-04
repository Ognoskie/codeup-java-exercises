import java.util.Random;
import java.util.Scanner;

public class HighLow {



	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int rand = new Random().nextInt(1, 100);
		System.out.println("Give me a number between 1 and 100");
		System.out.println("Random number is: " + rand);
		int userGuess = getInteger(1, 100);

//		for (int i = 0; i < 10; i++) {
			if (userGuess < rand) {
				System.out.println("too low");
			} else if (userGuess > rand) {
				System.out.println("too high");
			} else if (userGuess == rand) {
				System.out.println("You guessed it");
			}
//		}

	}


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




}
