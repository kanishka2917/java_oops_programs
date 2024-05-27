class Box{

	static int cost;
	int l, b, h;
	
	Box(int l, int b, int h){

		this.l = l;
		this.b = b;
		this.h = h;
	}

	Box(int l, int b, int h, int c){
		
		this(l, b, h);
		cost = c;
	}
}

class DemoSix{

	public static void main(String args[]){

		//direct access of static members
		Box b1 = new Box(5,10,15);
		System.out.println("cost of the box = " + Box.cost);
		Box b2 = new Box(25,35,45,75);
		System.out.println("cost of the box = " + Box.cost);

	}
}