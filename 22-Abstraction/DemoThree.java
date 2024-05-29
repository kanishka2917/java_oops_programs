abstract class Alpha{

	void m1(){//concrete

		System.out.println("Inside alpha m1");
	}

	abstract void m2();//Abstract method
	abstract void m3();//Abstract method
}

class Beta extends Alpha{//partial implementation

	void m2(){

		System.out.println("inside beta m2");
	}
	void fun(){

		System.out.println("inside beta fun");
	}

	abstract void m3();//it is optimal to write here
}

class Ceta extends Beta{

	void m3(){

		System.out.println("inside ceta m3");
	}
	void test(){

		System.out.println("inside test");
	}
}

class DemoThree{

	public static void main(String[] args){

		Ceta c = new Ceta();
		c.m1();
		c.m2();
		c.m3();
		c.fun();
		c.test();

		Beta b = null;
		Alpha a = null;
		a = c;
		a.m1();
		a.m2();
		a.m3();
		//a.fun();
		//a.test();

		b = c;
		b.m1();
		b.m2();
		b.m3();
		b.fun();
		//b.test();
	}
}

		
