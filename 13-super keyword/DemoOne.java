class Ramu{

	int x = 100;
	int y = 200;
	int z = 300;

	void printRamu(){
	
		System.out.println("inside Ramu x : " + x);
		System.out.println("inside Ramu y : " + y);
		System.out.println("inside Ramu z : " + z);
	}
}

class Shamu extends Ramu{

	int x = 25;
	int y = 35;
	int z = 45;

	void printShamu(){

		System.out.println("inside shamu x : " + super.x);
		System.out.println("inside Shamu y : " + y);
		System.out.println("inside Shamu z : " + z);

	}
}


class DemoOne{

	public static void main(String[] args){

		Shamu s = new Shamu();
		s.printShamu();
	}
}
