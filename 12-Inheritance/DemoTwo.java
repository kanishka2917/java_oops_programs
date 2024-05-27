class Alpha{

	int x;
	int y;

	void showAlpha(){

		System.out.println("value of x = " + x);
		System.out.println("value of y = " + y);
	}
}


class Beta extends Alpha{

	int z;

	void showBeta(){

		System.out.println("value of x = " + x);
		System.out.println("value of y = " + y);
		System.out.println("value of z = " + z);
	}

	void sum(){

		System.out.println("sum of x,y,z = " + (x + y + z));
	}
}


class DemoTwo{

	public static void main(String[] args){

		Alpha a = new Alpha();
		a.x = 5;
		a.y = 10;
		a.showAlpha();
		Beta b = new Beta();
		b.z = 25;
		b.showBeta();
	}
}
