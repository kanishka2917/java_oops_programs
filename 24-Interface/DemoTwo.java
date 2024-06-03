interface Alpha{
	
	int x = 1;
	void m1();
	void fun();
}

interface Beta{
	
	int y = 2;
	void m2();
	void fun();
}

class Zeta implements Alpha, Beta{

	public void m1(){
		
		System.out.println("Inside zeta m1");
	}
	
	public void m2(){
		
		System.out.println("Inside m2");
	}
}

class DemoTwo{

	public static void main(String args[]){

		Zeta z = null;
		Alpha a = null;
		Beta b = null;
		z = new Zeta();
		z.m1();
		z.m2();
		z.fun();

		System.out.println(A.x);
		System.out.println(a.x);
		System.out.println(B.y);
		System.out.println(b.y);
		System.out.println(Z.x);
		System.out.println(z.x);


		a = z;//implicit typecasting
		a.m1();
		a.fun();
		b = z;
		b.m2();
		b.fun();
	}
}