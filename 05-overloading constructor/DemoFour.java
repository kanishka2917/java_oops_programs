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

class DemoFour {
	public static void main(String[] args){
		Triangle t1 = new Triangle(5,6,7);
		Triangle t2 = new Triangle(10,20);
		Triangle t3 = new Triangle(7);
		t1.showPerimeter();
		t2.showPerimeter();
		t3.showPerimeter();
	}
}
