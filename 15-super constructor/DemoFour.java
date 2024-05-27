class Wrapper{

	Wrapper(){

		System.out.println("inside wrapper constructor");
	}
}
class Box extends Wrapper
{
	int l;
	int b;
	int h;

	Box(int l, int b, int h)
	{
		System.out.println("inside box constructor");
		this.l = l;
		this.b = b;
		this.h = h;
	}

	Box(){

	}
}


class DemoFour{

	public static void main(String[] args){

		Box b = new Box(5,10,15);
	}
}
