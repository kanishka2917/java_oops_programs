class Box{

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


class Triangle{

	int side_a;
	int side_b;
	int side_c;

	void showPerimeter(){

		int perimeter = side_a + side_b + side_c;
		System.out.println("perimeter of a triangle is : " + perimeter);
	}

	Triangle(int x, int y, int z){

		side_a = x;
	    side_b = y;
	    side_c = z;
	}

	Triangle(int x, int y){

		side_a = x;
	    side_b = x;
	    side_c = y;
	}

	Triangle(int x){

		side_a = x;
	    side_b = x;
	    side_c = x;
	}
}


class Bean{
	int x;
	int y;

	Bean (int i,int j){
		x = i;
		y = j;
	}
}


class DemoOne{

	public static void main(String[] args){

		Box b = new Box(5,5,5);//box object
		Triangle t;//declare triangle variable
		new Bean(2,3);//create a bean object without reference
	}
}

