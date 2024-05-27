class Box{

	int l; 
	int b;
	int h;
	
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

	Box(int x, int y, int z){
		l = x; 
		b = y;
		h = z;
	
		System.out.println("inside first constructor");
	}

	Box(){
		System.out.println("inside default contructor");
	}
	{
		System.out.println("address of current running box object is" + this);
	}

}

class DemoOne{
	public static void main(String[] args){

		Box b = new Box();
		Box b1 = new Box();
		Box b2 = new Box();
	}
}
