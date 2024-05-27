class Box{
	static int cost; 
	int l; 
	int b;
	int h;

	Box(int x, int y, int z){

		l = x;
		b = y;
		h = z;
	}

	void printVolume(){

		int volume = l * b * h;
		System.out.println("Volume of the box is : " + volume);
	}

	int fetchSurfaceArea(){

		int surfaceArea = 2 * (l * b + b * h + l * h);
		System.out.println("Area returned to caller");
		return surfaceArea;
	}

	void setBoxSize (int x, int y, int z){
		l = x;
		b = y;
		h = z;
	}
}

class DemoTwoTwo{

	public static void main(String[] args){

		Box b1 = new Box(5,10,15);
		Box b2 = new Box(10,20,30);
		Box b3 = new Box(25,35,45);
		System.out.println("previous cost of b1 box : " + b1.cost);
		System.out.println("previous cost of b2 box : " + b2.cost);
		System.out.println("previous cost of b3 box : " + b3.cost);
		Box.cost = 85;
		System.out.println("present cost of b1 box : " + b1.cost);
		System.out.println("present cost of b2 box : " + b2.cost);
		System.out.println("present cost of b3 box : " + b3.cost);
	}
}

