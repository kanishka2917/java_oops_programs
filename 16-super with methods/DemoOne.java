class Alpha{

	int i = 20;

	void print(){

		System.out.println("inside print method of class alpha");
		System.out.println("value of integer i : " + i);
	}
}

class Beta extends Alpha{

	double d = 3.142;
 
	void print(){

		super.print();
		System.out.println("inside print method of class beta");
		System.out.println("value of double d : " + d);
	}                                                    
}


class DemoOne{

	public static void main(String args[]){

		Beta b = new Beta();
		b.print();
	}
}
