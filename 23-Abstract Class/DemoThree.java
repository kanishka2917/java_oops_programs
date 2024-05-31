abstract class Animal{

	void eating(){

		System.out.println("Animal is eating");
	}
	abstract void sound();//setting standars method here
}

class Dog extends Animal{

	void sound(){
		
		System.out.println("Dog is barking");
	}
}

class Lion extends Animal{

	void sound(){

		System.out.println("Lion roars");
	}
}

class Cat extends Animal{

	void sound(){

		System.out.println("meeee-owwwww");
	}
}
class DemoThree{

	public static void main(String args[]){

		Cat c = new Cat();
		Dog d = new Dog();
		d.eating();
		Lion l = new Lion();
		l.sound();
	}
}
