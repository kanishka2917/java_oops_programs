class Alpha{
	
	final static int i; 
	
	Alpha(int i){

		this.i = i;//error: static members comes to life before constructor
	}
}

class DemoEleven
{
	public static void main(String[] args) 
	{
		System.out.println(Alpha.i);
	}
}
