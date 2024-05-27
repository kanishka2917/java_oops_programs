class Ramu{

	void sayHello(int a, int b){

		System.out.println("ramu says hello");
	}
	void sayHello(int c){

		System.out.println("ramu says hello");
	}
	void sayHello(){

		System.out.println("ramu says hello");
	}
}

class Shamu extends Ramu{

	void sayHello(double x, double y){

		System.out.println("shamu says hello");
	}
}

class Bheemu extends Shamu{

	void sayHello(String s1, String s2){

		System.out.println("bheemu says hello");
	}
}


class DemoOne{

	public static void main(String args[]){

		Bheemu b = new Bheemu();
		b.sayHello(2,3);
		b.sayHello(3.142,18);
		b.sayHello("soory","shakthiman");
	}
}