class Box{

	int l; 
	int b;
	int h;
	
	void setBoxSize (int l, int b, int h){
		this.l = l;
		this.b = b;
		this.h = h;
	}
}
class DemoTwo{
	public static void main(String[] args){
		Box b = new Box();
		b.setBoxSize(5,10,15);
		System.out.println("length of box b : " + b.l);
		System.out.println("breadth of box b : " + b.b);
		System.out.println("heigth of box b : " + b.h);
	}
}