interface Animal{

	void sound();
	void eat();
}
class Dog implements Animal{

	public void sound(){

		System.out.println("boww");
	}
	public void eat(){

		System.out.println("yum-yummm");
	}
}
class Lion implements Animal{

	public void sound(){

		System.out.println("Lion is roaring");
	}
	public void eat(){

		System.out.println("yummmyy- yum");
	}

	class Cat implements Lion{

	public void sound(){

		System.out.println("boww");
	}
	public void eat(){

		System.out.println("yum-yummm");
	}
}
}

class Hello{

	void m1(Animal z){

		if(z instanceof Lion){

			Lion l = (Lion)z;
			l.sound();
			l.eat();
	}
	else if (z instanceof Dog){

		Dog d = (Dog)z;
		d.sound();
		d.eat();
	}

	else if (z instanceof Cat){

		Cat c = (Cat)z;
		c.sound();
		c.eat();
	}
}
}
class DemoSeven{

	public static void main(String args[]){

		
	
	}
}
