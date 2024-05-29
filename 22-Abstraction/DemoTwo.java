abstract class Alpha{

	void m1(){//concrete

		System.out.println("Inside alpha m1");
	}

	abstract void m2();//Abstract method
	abstract void m3();//Abstract method
}

class Beta extends Alpha{

	void m2(){

		System.out.println("inside beta m2");
	}
	void m3(){

		System.out.println("inside beta m3");
	}
	void fun(){

		System.out.println("inside beta fun");
	}
}

class DemoTwo{

	public static void main(String[] args){

		Beta b = new Beta();
		b.m1();
		b.m2();
		b.m3();
		b.fun();

		Alpha a = null;
		a.m1();
		a.m2();
		a.m3();
		//a.fun();

		//Alpha a = new Beta();
		a.m1();
		a.m2();
		a.m3();// beta output will be printed
		
	    //Beta b = (Beta)a;//typecasting Abstact class to subclass type
		b.m1();
		b.m2();
		b.m3();
		b.fun();
	}
}
