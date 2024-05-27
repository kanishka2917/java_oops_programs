class DemoThree{
	public static void main(String[] args){
		Box b = new Box();
		b = null;
		b.printVolume();
		System.out.println("surface area:" +b.fetchSurfaceArea());
		System.out.println("length of box b :" + b.l);
		System.out.println("breadth of box b :" + b.b);
		System.out.println("heigth of box b :" + b.h);
	}
}
