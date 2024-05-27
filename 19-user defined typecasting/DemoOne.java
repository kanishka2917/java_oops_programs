class Alpha{

	void m1(){

		System.out.println("inside m1");
	}
}

class Beta extends Alpha{

	void m2(){

		System.out.println("inside m2");
	}
}

class DemoOne{

	public static void main(String args[]){

		Alpha a = new Alpha();
		Beta b = new Beta();
		a = b; //Implicit type casting
	}
}