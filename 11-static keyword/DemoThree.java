class Alpha{

	int p;
	double q;
	static int i;
	static double j;

	{
		System.out.println("inside instance block");
		System.out.println(p);//accessing an instance variable p
		System.out.println(q);//accessing an instance variable q
	}

	static{

		System.out.println("inside satic block");
		System.out.println(i);//accessing static variable i
		System.out.println(j);//accessing static variable j
		//"System.out.println(p);"//accessing an instance variable p is not possible and will give a error
	}
}

class DemoThree{

	public static void main(String[] args){

		Alpha a;
		a = new Alpha();
	}
}
