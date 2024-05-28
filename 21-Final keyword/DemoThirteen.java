class Box{

	int w,d,h;
}

class Hello{

	final static Box b = new Box();
	
	static{

		Box b = new Box();
	}
}

class DemoThirteen{

	public static void main(String[] args){

		System.out.println(Hello.b);
		Hello h = new Hello();
		System.out.println("before initialising " + Hello.b.w);
		System.out.println("before initialising " + Hello.b.h);
		System.out.println("before initialising " + Hello.b.d);
		//Hello.b = null; //error: cannot modify value of b
		//Hello b = new Box(5,6,7);//error
		Hello.b.w = 55;
		Hello.b.h = 65;
		Hello.b.d = 75;
		System.out.println("after initialising " + Hello.b.w);
		System.out.println("after initialising " + Hello.b.h);
		System.out.println("after initialising " + Hello.b.d);
		
	}

}
		
	