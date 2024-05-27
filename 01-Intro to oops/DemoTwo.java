class Box{
	int l = 5;
	int b = 5;
	int h = 5;

	void printVolume(){
		int volume = l * b * h;
		System.out.println("Volume of the box is : " + volume);
	}

	int fetchSurfaceArea(){
		int surfaceArea = 2 * (l * b + b * h + l * h);
		System.out.println("Area returned to caller");
		return surfaceArea;
	}
}

class DemoTwo{
	public static void main(String args[]){
		Box b1 = new Box();
		Box b2 = new Box();
		Box b3 = new Box();
		System.out.println("the value of length : " + b2.l);
		System.out.println("the value of breadth : " + b2.b);
		System.out.println("the value of height : " + b2.h);
		b2.l = 10;
		b2.b = 20;
		b2.h = 30;
		System.out.println("the altered value of length : " + b2.l);
		System.out.println("the alteredvalue of breadth : " + b2.b);
		System.out.println("the altered value of height : " + b2.h); // ASSINGMENT 2
		int surfaceArea = b3.fetchSurfaceArea();
		b3.l = 25;
		b3.b = 35;
		b3.h = 45;
		System.out.println("the altered value of length : " + b3.l);
		System.out.println("the alteredvalue of breadth : " + b3.b);
		System.out.println("the altered value of height : " + b3.h); // ASSINGMENT three
	}
}
