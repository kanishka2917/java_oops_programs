class DemoOne{
	public static void main(String[] args){
		Box b1 = new Box();
		Triangle t1 = new Triangle(5,6,7);
		Box b2;//Box Reference Variable
		b2 = b1;//Transfer of Address
		Triangle t2;//Triangle reference variable
		t2 = b2;
	}
}
