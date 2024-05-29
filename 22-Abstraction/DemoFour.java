abstract class Alpha{//Abstract class

	void m1(){//concrete

		System.out.println("Inside alpha m1");
	}

	abstract void m2();//Abstract method
	abstract void m3();//Abstract method
}

class Beta extends Alpha{//concrete class

	void m2(){

		System.out.println("inside beta m2");
	}
	void m3(){

		System.out.println("inside beta m3");
	}
}

class DemoFour{

	public static void main(String[] args){

		Beta b = new Beta();
		b.m1();
		b.m2();
		b.m3();
	}
}

		
