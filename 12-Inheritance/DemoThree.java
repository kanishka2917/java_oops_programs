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

	int p = 25;
	int q = 35;
	int r = 45;

	void printShamu(){

		System.out.println("inside Shamu p : " + p);
		System.out.println("inside Shamu q : " + q);
		System.out.println("inside Shamu r : " + r);
		System.out.println("inside shamu x : " + x);
		System.out.println("inside Shamu y : " + y);
		System.out.println("inside Shamu z : " + z);

	}
}


class DemoThree{

	public static void main(String[] args){

		Shamu s = new Shamu();
		s.printShamu();
	}
}
