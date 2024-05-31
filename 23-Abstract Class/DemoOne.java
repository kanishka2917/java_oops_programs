abstract class Alpha{
	
	static void m1(){

		System.out.println("In Alpha class");
	}
	
	static void m2(){

		System.out.println("In Alpha class");
	}
}

class Beta extends Alpha{

}

class DemoOne{

	public static void main(String args[]){

		Beta b = new Beta();
		b.m1();
		b.m2();
		//Alpha.m1();
		//Alpha.m2();
	}
}