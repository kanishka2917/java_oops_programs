interface Alpha{

	void m1();
	void m2();
}

interface Beta{

	void m3();
	void m4();
}

class Zeta implements Alpha, Beta{

	public void m1(){
		
		System.out.println("Inside zeta m1");
	}
	
	public void m2(){
		
		System.out.println("Inside m2");
	}
	
	public void m3(){
		
		System.out.println("Inside m3");
	}

	public void m4(){
		
		System.out.println("Inside Zeta m4");
	}

	void fun(){

		System.out.println("Inside fun");
	}
}

class DemoOne{

	public static void main(String args[]){

		Zeta z = null;
		Alpha a = null;
		Beta b = null;
		z = new Zeta();
		z.m1();
		z.m2();
		z.m3();
		z.fun();
		z.m4();
	}
}