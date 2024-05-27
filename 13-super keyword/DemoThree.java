class Ramu{

	int x = 100;
	int y = 200;
	int z = 300;

	void printRamu(){
	
		System.out.println("inside Ramu x : " + x);
		System.out.println("inside Ramu y : " + y);
		System.out.println("inside Ramu z : " + z + "\n");
	}
}

class Shamu extends Ramu{

	int x = 25;
	int y = 35;
	int z = 45;

	void printShamu(){

		System.out.println("inside shamu x : " + x);
		System.out.println("inside Shamu y : " + y);
		System.out.println("inside Shamu z : " + z + "\n");

	}
}

class Bheemu extends Shamu{

	int i = 47;
	int j = 57;
	int k = 87;

	void printBheemu(){

		System.out.println("inside Bheemu x : " + x);
		System.out.println("inside Bheemu y : " + y);
		System.out.println("inside bheemu z : " + z + "\n");

	}
}

class Mamu extends Bheemu{

	int a = 69;
	int b = 79;
	int c = 89;

	void printMamu(){

		System.out.println("inside mamu x : " + super.x);
		System.out.println("inside mamu y : " + super.y);
		System.out.println("inside mamu z : " + super.z);

	}
}


class DemoThree{

	public static void main(String[] args){

		Mamu m = new Mamu();
		m.printMamu();
	}
}
