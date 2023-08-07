import java.util.Arrays;

public class ArraysExercises {

	private static Person[] addPerson(Person[] people, Person personToAdd) {
		Person[] newArray = Arrays.copyOf(people, people.length + 1);
		int lastIndexInArray = newArray.length - 1;
		newArray[lastIndexInArray] = personToAdd;
		return newArray;
	}
	public static void main(String[] args) {
		System.out.println(Arrays.toString(numbers));



		Person[] people = {
				new Person("Barry Bee Benson"),
				new Person("Cat"),
				new Person("Dog")
		};
		System.out.println(people[1].getName());
		System.out.println(Arrays.toString(people));

people = addPerson(people, new Person("Bardfen"));
		System.out.println(Arrays.toString(people));
	}




	public static int[] numbers = {1, 2, 3, 4, 5};




}
