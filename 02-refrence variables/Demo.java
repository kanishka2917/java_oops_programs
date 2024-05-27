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
}



class Demo 
{
	public static void main(String[] args) 
	{
		Box b = new Box();
		b.setBoxSize(5,6,7);
		System.out.println("length of box b : " + b.l);
		System.out.println("breadth of box b : " + b.b);
		System.out.println("heigth of box b : " + b.h);
		System.out.println("surface area of the box b : " + b.fetchSurfaceArea());
		b.printVolume();
	}
}
