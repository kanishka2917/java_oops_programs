abstract class Alpha{

	void m1(){//concrete

		System.out.println("Inside alpha m1");
	}
	void m2(){//concrete
		
		System.out.println("Inside alpha m2");
	}

	abstract void m3();//Abstract method

	{//Instance method
		System.out.println("hello");
	}
}

class Beta extends Alpha{

	void m3(){//overriding m3() is mandatory

		System.out.println("inside beta m3");
	}
}

class DemoOne{

	public static void main(String[] args){

		Alpha a = null;//declaring a reference variable of abstract class datatype alpha
		//a = new Alpha();//we never create object of abstract class
		Beta b = null;//eclaring a reference variable of subclass datatype beta
		b = new Beta();
		b.m1();
		b.m2();
		b.m3();
		a = b;// superclass reference variable can refer to subclass objects
		a.m1();
		a.m2();
		a.m3();
	}
}
