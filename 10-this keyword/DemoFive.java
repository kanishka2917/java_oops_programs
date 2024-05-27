class Alpha{

	int numbers;
	String text;
	double decimal;

	private Alpha(double d){
		decimal = d;
	}
	
	private Alpha(String t,double d){
		this(d);
		text = t;
	}

	Alpha(int n,String t,double d){
		this(t,d);
		numbers = n;
	}
}

class DemoFive{
	public static void main(String[] args){
		Alpha a = new Alpha(20,"romeo",3.13);
	}
}