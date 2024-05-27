class Alpha{

	int x;
	int y;

	void showAlpha(){

		System.out.println("start of alpha");
		System.out.println("value of x = " + x);
		System.out.println("value of y = " + y);
		System.out.println("end of alpha \n");
	}
}


class Beta extends Alpha{

	int z;

	void showBeta(){

		System.out.println("start of beta");
		System.out.println("value of x = " + x);
		System.out.println("value of y = " + y);
		System.out.println("value of z = " + z);
		System.out.println("end of beta");
	}

	void sum(){

		System.out.println("sum of x,y,z = " + (x + y + z));
	}
}


class DemoTwoTwo{

	public static void main(String[] args){

		Beta b = new Beta();
		b.x = 200;
		b.y = 300;
		b.showAlpha();
		b.z = 500;
		b.showBeta();
	}
}
