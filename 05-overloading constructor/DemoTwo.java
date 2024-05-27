class Box{
	int l; 
	int b;
	int h;
	Box(int x, int y, int z){
		l = x;
		b = y;
		h = z;
	}
	
	Box(){
		System.out.println("default constructor");
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

class DemoTwo {
	public static void main(String[] args){
		Box b;
		b = new Box(5,6,7);
	}
}