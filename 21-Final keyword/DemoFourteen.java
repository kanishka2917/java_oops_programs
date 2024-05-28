class Box
{
	int w,h,d;
}
class Hello{

	void m1(final Box b){

		System.out.println(b);
		System.out.println(b.w);
		//b = null;
		//final local variables including parameters cannot be changed within the scope
		//b = new Box();
	}
}

class DemoFourteen{

	public static void main(String[] args){

		Box z = new Box();
		Hello h = new Hello();
		//h.m1(2);
	}
}
