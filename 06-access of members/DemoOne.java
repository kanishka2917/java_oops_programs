class Triangle{
	int side_a;
	int side_b;
	int side_c;

	void showPerimeter(){
		Triangle(x,x,x);
		int perimeter = side_a + side_b + side_c;
		System.out.println("perimeter of a triangle is : " + perimeter);
	}
	
	void ninPindaMethod()
	{
		System.out.println("executing nin pinda method");
		showPerimeter();
	}

	Triangle(int x, int y, int z){
		showPerimeter();
		ninPindaMethod();
		side_a = x;
	    side_b = y;
	    side_c = z;
	}

	Triangle(int x, int y){
		showPerimeter();
		ninPindaMethod();
		side_a = x;
	    side_b = x;
	    side_c = y;
	}

	Triangle(int x){
		showPerimeter();
		ninPindaMethod();
		side_a = x;
	    side_b = x;
	    side_c = x;
	}
}

class DemoOne{
	public static void main(String args[]){
		Triangle t1 = new Triangle(5,5,5);
		Triangle t2 = new Triangle(6,7);
		Triangle t3 = new Triangle(8);
		
		/*t.side_a = 10;
		t.side_b = 20;
		t.side_c = 30;
		t.showPerimeter();
		t.ninPindaMethod();*/
	}
}
