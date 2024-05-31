abstract class Alpha{

	int p;
	int q;
	
	static int z = 2;
	
	Alpha(int p, int q){

		this.p = p;
		this.q = q;
	}
	void m1(){

		System.out.println("the value of p, q is : " + p + q);
	}
}
	
	

class Beta extends Alpha{

	int r ;
	Beta(int p, int q, int r){

		super(p,q);
		this.r = r;
	}

	void m1(){
		
		super.m1();
		System.out.println("the value of r is : " + r);
	}
}

class DemoTwo{

	public static void main(String args[]){

		Alpha a;
		a = new Beta(5,6,7);
		a.m1();
		Alpha a1 = new Beta(10,20,30);
		System.out.println(Alpha.z);
		//Alpha.m1();
		//Alpha.m2();
	}
}