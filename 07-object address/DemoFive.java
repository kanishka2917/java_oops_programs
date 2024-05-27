class Box{
	int l; 
	int b;
	int h;
	Box(){
		System.out.println("Default construstor");
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

	protected void`aaaaaaaaaaaaaaaaa finalize(){
		System.out.println("bye bye");
	}
}

class BeanBag{
	private int weight;
	private String color;

	BeanBag(int w, String c){
		weight = w;
		color = c;
	}
	
	void showBeanBag(){
		System.out.println("the color of bean bag is : " + color + "  , weight of the bean bag is " + weight);
	}
	
	protected void finalize(){
		System.out.println("bye");
	}
}


class DemoFive{
	public static void main(String[] args){
		Box b = new Box();
		b = null;
		System.gc();
		new Triangle (5,5);
		System.gc();
		new BeanBag (12, "brown");
		System.gc();
	}
}
