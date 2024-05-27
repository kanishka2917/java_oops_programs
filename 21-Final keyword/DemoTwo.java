class Alpha{

	final void m1(){
		System.out.println("Inside m1");
	}
}

class Beta extends Alpha{

	int z;
	void m1(){  //cannot be overridden
		System.out.println("Inside m1 overridden");
	}
}


class DemoTwo{

	public static void main(String[] args){

		Alpha a = new Alpha();
		a.m1();
		Beta b = new Beta();
		b.m1();

	}
}
