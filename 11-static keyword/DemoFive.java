class Box{

	static int cost = 50;
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

class DemoFive{

	public static void main(String args[]){

		System.out.println("cost of the box = " + Box.cost);
	}
}