class Alpha{

	int i;

	Alpha(int i){

		this.i = i;
	}
	
	void m1(int i){

		this.i = i;
	}
}

class DemoFour{

	public static void main(String[] args){

		Alpha a = new Alpha(25);
		System.out.println("value of i : " + a.i);
		a.i = 35;//changing value of i in Alpha object
		System.out.println("value of i : " + a.i);		
	}
}
