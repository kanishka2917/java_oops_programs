abstract class Alpha{//Abstract class

	void m1(){//concrete

		System.out.println("Inside alpha m1");
	}
	void m2(){

		System.out.println("inside alpha m2");
	}
}

class Beta extends Alpha{//concrete class

	
	void m1(){
		
		super.m1();
	}

	void m2(){

		super.m2();
	}
}

class DemoFive{

	public static void main(String[] args){

		Beta b = new Beta();
		b.m1();
		b.m2();
		
		//Alpha a = new Alpha();
	}
}

		
