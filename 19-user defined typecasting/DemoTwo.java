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

class DemoTwo{

	public static void main(String args[]){

		Alpha a = new Beta();//Implicit type casting
		Beta b; //declaring a subclass variable
		b = (Beta)a; //Explicit type casting
		b.m1();
		b.m2();
	}
}
