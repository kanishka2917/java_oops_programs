class DemoFour{
	public static void main(String[] args){
		Triangle t1 = new Triangle(6,7,8);
		Triangle t2 = new Triangle(10,5);
		Triangle t3 = new Triangle(7);
		t1 = t2;
		t2 = t3;
		t1 = t3;
		t1.side_a = 100;
		t2.side_b = 100;
		t3.side_c = 100;
		t1.showPerimeter();
		t2.showPerimeter();
		t3.showPerimeter();
	}
}
