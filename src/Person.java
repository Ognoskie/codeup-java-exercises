public class Person {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Braden");
		String braden = person.getName();
		System.out.println(braden);
		person.sayHello();

		Person person1 = new Person("John");
		Person person2 = new Person("John");
		System.out.println(person1.getName().equals(person2.getName()));
		System.out.println(person1 == person2);

//		Person person1 = new Person("John");
//		Person person2 = person1;
//		System.out.println(person1 == person2);
//
//		Person person1 = new Person("John");
//		Person person2 = person1;
//		System.out.println(person1.getName());
//		System.out.println(person2.getName());
//		person2.setName("Jane");
//		System.out.println(person1.getName());
//		System.out.println(person2.getName());


	}

//	The class should have a constructor that accepts a `String` value and sets
//	the person's name to the passed string.
//
//	Create a `main` method on the class that creates a new `Person` object and
//	tests the above methods.

	// Instance Properties
	private String name;
// to access the Instance use the "this." to get that Instance property

	public Person(){

	}

	public Person(String name){
		this.name = name;
	}


	public String getName(){
//TODO: return the person's name
		return this.name;
	}

	public void setName(String name){
//TODO: change the name field to the passed value
		this.name = name;
	}
	public void sayHello(){
//TODO: print a message to the console using the person's name
		System.out.println("Hello welcome to the next 25 years of your life " + this.name);
	}

}
