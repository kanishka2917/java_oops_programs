class Triangle{
	int side_a;
	int side_b;
	int side_c;
	
	Triangle(int x){
		
		this(x,x,x);
		System.out.println("inside first constructor");
	}
		Triangle(int x, int y, int z){
		
		side_a = x;
		side_b = y;
		side_c = z;
		System.out.println("inside second constructor");
	}
}

class DemoFour{
	public static void main(String[] args){
		
		Triangle t1 = new Triangle(5);
		System.out.println("side_a of t1 : " + t1.side_a);
		System.out.println("side_b of t1 : " + t1.side_b);
		System.out.println("side_c of t1 : " + t1.side_c);
		Triangle t2 = new Triangle(10,20,30);
		System.out.println("side_a of t2 : " + t2.side_a);
		System.out.println("side_b of t2 : " + t2.side_b);
		System.out.println("side_c of t2 : " + t2.side_c);

	}
}
