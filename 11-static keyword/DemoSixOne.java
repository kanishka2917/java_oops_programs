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

class DemoSixOne{

	public static void main(String args[]){

		//Indirect access of static members
		System.out.println("previous cost of the box = " + Box.cost);
		new Box(5,10,15).cost = 65;
		System.out.println("current cost of the box = " + Box.cost);

	}
}