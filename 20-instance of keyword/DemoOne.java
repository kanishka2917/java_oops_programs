class Animal{

}

class Dog extends Animal{

}

class Labrador extends Dog{

}

class Box{

}

class DemoOne{

	public static void main(String args[]){

		Animal a = new Animal();
		Dog d = new Dog();
		Labrador l = new Labrador();
		
		System.out.println("Is 'a' an instance of class Animal : " + (a instanceof Animal));
		
		System.out.println("Is 'd' an instance of class Dog : " + (d instanceof Dog));
		
		System.out.println("Is 'l' an instance of class Labrador : " + (l instanceof Labrador));
		
		//System.out.println("Is 'a' an instance of class Box : " + (a instanceof Box));
		//System.out.println("Is 'd' an instance of class Box : " + (d instanceof Box));

		//System.out.println("Is 'l' an instance of class Box : " + (l instanceof Box));
		
		System.out.println("Is 'l' an instance of class Animal : " + (l instanceof Animal));
		
		System.out.println("Is 'l' an instance of class Dog : " + (l instanceof Dog));
		
		System.out.println("Is 'd' an instance of class Animal : " + (d instanceof Animal));
		
		System.out.println("Is 'd' an instance of class Labrador : " + (d instanceof Labrador));
		
		System.out.println("Is 'a' an instance of class Labrador : " + (a instanceof Labrador));
	}
}