class DemoTwo{
	public static void main(String[] args){
		Triangle t1 = new Triangle(2,3,4);
		BeanBag b1 = new BeanBag(5, "pinK");
		Triangle t2;
		BeanBag b2;
		t2 = t1;
		b2 = b1;
		//t1.showPerimeter();
		//t2.showPerimeter();
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(b1);
		System.out.println(b2);
	}
}
