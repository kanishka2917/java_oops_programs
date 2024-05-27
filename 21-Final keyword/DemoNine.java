class Alpha{
	
	final static int i;

	static{

			i = 5;//assinging static final variable inside static block
	}
}

class DemoNine 
{
	public static void main(String[] args) 
	{
		System.out.println(Alpha.i);
	}
}
