package InterfacesAndAbstractClasses;

public  class InterfacesAndAbstractClasses {

	public static void main(String[] args) {
//		Animal someAnimal = new Animal();
//		Animal myWorm = new Worm();
		Worm myWorm = new Worm();
		myWorm.makeNoise();

		Animal america = new Eagle();
		america.makeNoise();
	}
}
