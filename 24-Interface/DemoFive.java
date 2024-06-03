class Alpha{
	
	void m1(){

		System.out.println("inside alpha m1");
	}

	void fun(){

		System.out.println("inside alpha fun");
	}
}

class Beta{

	void m2(){

		System.out.println("inside beta m2");
	}

	void fun(){

		System.out.println("inside beta fun");
	}
}

class Zeta extends Alpha{

	void nuta(){
	}
}

class Alpha1 extends Alpha{

	void fun(){
	}
}

class Beta1 extends Beta{

	void fun(){
	}
}
class DemoFive{

	public static void main(String args[]){

	}
}