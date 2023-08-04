public class Person {

//	The class should have a constructor that accepts a `String` value and sets
//	the person's name to the passed string.
//
//	Create a `main` method on the class that creates a new `Person` object and
//	tests the above methods.

//	public Name(){
//
//	}

	private String name;

	public String getName(){
//TODO: return the person's name
		return "boofy";
	}

	public void setName(String name){
//TODO: change the name field to the passed value
		this.name = "Braden";
	}
	public void sayHello(){
//TODO: print a message to the console using the person's name
		System.out.println("Hello welcome to java" + getName());
	}

}
