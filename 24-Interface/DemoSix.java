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
}
class Hello{

	void m1(Animal z){

		System.out.println(z);
		z.sound();
		z.eat();
	}
}
class DemoSix{

	public static void main(String args[]){

		Hello h = new Hello();
		Animal a = null;
		a = new Dog();
		h.m1(a);
		//System.out.ptintln();
	
	}
}
