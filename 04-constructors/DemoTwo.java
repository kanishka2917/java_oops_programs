class Cat{
	int size;
	String name;

	Cat(int s,String n){
		size = s;
		name = n;
	}

	void sayMeow(){
		System.out.println("meow");
	}
}

class Dog{
	int tagName;
	String breed;

	Dog(int a, String b){
		tagName = a;
		breed = b;
	}

	void barkBow(){
		System.out.println("bow bow");
	}
}

class DemoTwo{
	public static void main(String args[]){
		
		Cat c = new Cat(10,"kitty");

		Dog d = new Dog(20,"huskie");
		
		d.barkBow();
		c.sayMeow();
		System.out.println(c.size);
		System.out.println(c.name);
		System.out.println(d.tagName);
		System.out.println(d.breed);
-	}
}