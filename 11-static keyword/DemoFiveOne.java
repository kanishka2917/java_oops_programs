class Box{

	private static int cost = 50;
	int l, b, h;
	
	Box(int l, int b, int h){

		this.l = l;
		this.b = b;
		this.h = h;
	}

	void updateCost(int c){

		cost = c;
		System.out.println("updated cost of the box = " + cost);
	}
}

class DemoFiveOne{

	public static void main(String args[]){

		//System.out.println("cost of the box = " + Box.cost);
		Box b;
		b = new Box(1,1,1);
		b.updateCost(75);
	}
}