import java.util.Random;

public class ServerNameGenerator {


	public static void main(String[] args) {
		System.out.println("Here is words: " + randomGenerator(adjectives) + "-" + randomGenerator(nouns));
	}



		static String[] adjectives = {
				"Enigmatic",
				"Serene",
				"Vibrant",
				"Resilient",
				"Luminous",
				"Quirky",
				"Melancholic",
				"Exuberant",
				"Tenacious",
				"Breathtaking"
		};



	static 	String[] nouns = {
				"Chair",
				"Book",
				"Mountain",
				"Sunflower",
				"Car",
				"Ocean",
				"Laptop",
				"Dog",
				"Music",
				"Pizza"
		};

	public static String randomGenerator(String[] array) {
		Random random = new Random();
		int randomIndex = random.nextInt(array.length);
		return array[randomIndex];
	}






}
