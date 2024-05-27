class Object
{
	Object(){
	}
}


class Box
{
	int l;
	int b;
	int h;

	Box(int l, int b, int h)
	{
		super();
		this.l = l;
		this.b = b;
		this.h = h;
	}

	Box(){

	}
}

class Courier extends Box
{
	String city;

	Courier(int l, int b, int h, String city)
	{
		//super();
		super(l,b,h);
		this.city = city;
	}
}



class Demo 
{
	public static void main(String[] args) 
	{
		Courier c = new Courier(55, 65, 75, "Pune");

		System.out.println(c.l);
		System.out.println(c.b);
		System.out.println(c.h);
		System.out.println(c.city);
	}
}
