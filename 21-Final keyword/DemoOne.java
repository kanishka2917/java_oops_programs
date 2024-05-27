final class Alpha{

	void m1(){
		System.out.println("Inside m1");
	}
}

class Beta extends Alpha{//cannot be extended

	int z;
	void m1(){
		System.out.println("Inside m1 overridden");
	}
}


class DemoOne{

	public static void main(String[] args){

		Alpha a = new Alpha();
		a.m1();
		Beta b = new Beta();
		b.m1();

	}
}
