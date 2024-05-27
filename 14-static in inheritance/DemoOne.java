class Alpha{

	int x = 25;
	int y = 35;
	static String s1 = "A for Alpha";
	static int p = 100;

	void showAlpha(){

		System.out.println("value of x : " + x);
		System.out.println("value of y : " + y);
		System.out.println("value inside static string s1 : " + s1);
		System.out.println("value inside static int p : " + p);
	}
}

class Beta extends Alpha{

	int z = 45;
	

	void showBeta(){

		System.out.println("value of x : " + x);
		System.out.println("value of y : " + y);
		System.out.println("value of z : " + z);
		System.out.println("value inside static string s1 : " + s1);
		System.out.println("value inside static int p : " + p);
	}

}
class DemoOne{

	public static void main(String[] args){

		Beta b = new Beta();
		b.showBeta();
		//Alpha a = new Alpha();
		//a.showAlpha();
	}
}
